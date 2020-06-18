package com.schemati.compiler.configLanguage;

import com.schemati.compiler.configLanguage.antlr4.ConfigParser;
import com.schemati.compiler.configLanguage.antlr4.ConfigBaseVisitor;
import com.schemati.compiler.configLanguage.antlr4.ConfigParser;

import java.awt.*;
import java.util.List;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;

public class Config extends ConfigBaseVisitor<Object> {
    public HashMap<String, String> headerVariables = new HashMap<>();
    public HashMap<String, Object> sceneAttributes = new HashMap<>();

    @Override
    public Object visitProg(ConfigParser.ProgContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Object visitHeader(ConfigParser.HeaderContext ctx) {
        try {
            List<String> lines = Files.readAllLines(Paths.get(ctx.FilePath().getText()));
            boolean isHeaderLine = true;
            for (String line : lines) {
                //First line contains the Header Type definition
                if (isHeaderLine) {
                    if (!isValidHeader(line)) {
                        System.out.println(line + " is not a valid header type file.");
                        System.exit(0);
                    }
                    isHeaderLine = false;
                } else {
                    try {
                        line = line.trim();
                        String id = line.split("-")[0].trim();
                        String val = line.split("-")[1].trim();
                        headerVariables.put(id, val);
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println(ctx.FilePath().getText() + " header file is not defined properly.");
                        System.exit(0);
                    }
                }
            }

        } catch (IOException e) {
            System.out.println("File " + ctx.FilePath().getText() + " not found.");
            System.exit(0);
        }

        return null;
    }

    public boolean isValidHeader(String header) {
        return header.equalsIgnoreCase("&header");
    }

    @Override
    public Object visitLoad(ConfigParser.LoadContext ctx) {
        if (headerVariables.get(ctx.ID().getText()) == null) {
            System.out.println(ctx.ID().getText() + " variable was not found in any included header file");
        }
        return headerVariables.get(ctx.ID().getText());
    }

    @Override
    public Object visitScene(ConfigParser.SceneContext ctx) {
        sceneAttributes.put("title", visit(ctx.title()));
        sceneAttributes.put("width", visit(ctx.width()));
        sceneAttributes.put("height", visit(ctx.height()));
        sceneAttributes.put("scale", visit(ctx.scale()));
        sceneAttributes.put("background", visit(ctx.background()));
        return null;
    }


    @Override
    public Object visitVarLoad(ConfigParser.VarLoadContext ctx) {
        return visit(ctx.load());
    }

    @Override
    public Object visitVarLocal(ConfigParser.VarLocalContext ctx) {
        return ctx.getText();
    }


    @Override
    public Object visitTitle(ConfigParser.TitleContext ctx) {
        return visit(ctx.var());
    }

    @Override
    public Object visitBackground(ConfigParser.BackgroundContext ctx) {
        return visit(ctx.var());
    }

    @Override
    public Object visitWidth(ConfigParser.WidthContext ctx) {
        return visit(ctx.var());
    }

    @Override
    public Object visitHeight(ConfigParser.HeightContext ctx) {
        return visit(ctx.var());
    }

    @Override
    public Object visitScale(ConfigParser.ScaleContext ctx) {
        return visit(ctx.var());
    }
}
