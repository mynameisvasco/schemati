package com.schemati.compiler.languageUtils;

import java.util.ArrayList;
import java.util.List;

public class Function implements Scopable {
    private Type returnType;
    private String id;
    private List<Variable> arguments;

    public Function(String id, Type returnType) {
        this.id = id;
        this.returnType = returnType;
        this.arguments = new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    public int getArgumentsSize() {
        return this.arguments.size();
    }

    public Variable getArgument(String id) {
        return this.arguments.stream().filter(a -> a.getId().equals(id)).findFirst().orElse(null);
    }

    public boolean addArgument(Variable arg) {
        for(Variable v : arguments) {
            if(v.getId().equals(arg.getId())) {
                return false;
            }
        }
        return this.arguments.add(arg);
    }

    public Type getReturnType() {
        return returnType;
    }

    public List<Variable> getArguments() {
        return arguments;
    }
}
