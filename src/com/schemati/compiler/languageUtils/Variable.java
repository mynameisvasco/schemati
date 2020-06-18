package com.schemati.compiler.languageUtils;

public class Variable implements Scopable {
    private Type type;
    private String id;

    public Variable(Type type, String id) {
        this.type = type;

        this.id = id;
    }

    public String getId() {
        return id;
    }

    public Type getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Variable{" +
                "type=" + type +
                ", id='" + id + '\'' +
                '}';
    }
}
