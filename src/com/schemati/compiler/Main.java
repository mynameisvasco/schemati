package com.schemati.compiler;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import com.schemati.compiler.configLanguage.Config;
import com.schemati.compiler.configLanguage.antlr4.ConfigLexer;
import com.schemati.compiler.configLanguage.antlr4.ConfigParser;
import com.schemati.compiler.mainLanguage.CompilerVisitor;
import com.schemati.compiler.mainLanguage.SemanticVisitor;
import com.schemati.compiler.mainLanguage.antlr4.MainLexer;
import com.schemati.compiler.mainLanguage.antlr4.MainParser;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class Main {
   public static void main(String[] args) {
      if(args.length != 2) {
         System.out.println("Usage: schemati [programName].sch [configName].schc");
         System.exit(0);
      }
      System.out.println("Compiling...");
      try {
         CharStream input = CharStreams.fromPath(Paths.get(".").resolve(args[0]));
         MainLexer lexer = new MainLexer(input);
         CommonTokenStream tokens = new CommonTokenStream(lexer);
         MainParser parser = new MainParser(tokens);
         ParseTree tree = parser.prog();

         CharStream inputConfig = CharStreams.fromPath(Paths.get(".").resolve(args[1]));
         ConfigLexer lexerConfig = new ConfigLexer(inputConfig);
         CommonTokenStream tokensConfig = new CommonTokenStream(lexerConfig);
         ConfigParser parserConfig = new ConfigParser(tokensConfig);
         ParseTree treeConfig = parserConfig.prog();


         if (parser.getNumberOfSyntaxErrors() == 0) {
            Config config = new Config();
            config.visit(treeConfig);
            SemanticVisitor semantic = new SemanticVisitor();
            semantic.visit(tree);
            CompilerVisitor compiler = new CompilerVisitor();
            compiler.sceneAttributes = config.sceneAttributes;
            compiler.headerVariables = config.headerVariables;
            compiler.globalScope = semantic.globalScope;
            compiler.filename = args[0].split("/")[args[0].split("/").length -1].replace(".sch", "");
            compiler.visit(tree);
            Files.write(Paths.get(args[0].replace(".sch", ".java")), compiler.output.getBytes());
            System.out.println("Complete!");
         }
      }
      catch(IOException | RecognitionException e) {
         System.out.println(e);
         System.exit(1);
      }
   }
}
