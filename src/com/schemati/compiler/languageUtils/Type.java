package com.schemati.compiler.languageUtils;

import java.util.ArrayList;
import java.util.List;

public class Type {
    protected boolean isArray;

    public Type(boolean isArray) {
        if(isArray) {
            this.attributes.add(new Variable(Type.fromString("Integer"), "size"));
        }
    }

    protected List<Variable> attributes = new ArrayList<>();

    public boolean canUnary() {
        return false;
    }

    public boolean canAlgebricWith(Type t) {
        return false;
    }

    public boolean canCompareWith(Type t) {
        return false;
    }

    public boolean compatibleWith(String typeString) {
        return false;
    }

    public boolean canAssign(Type t) {
        return false;
    }

    public boolean canAddToArray(Type t) {
        return t.getClass().getSimpleName().equals(this.getClass().getSimpleName()) && !t.isArray();
    }

    public static Type fromString(String s) {
        switch (s) {
            case "Integer":
                return new IntegerType();
            case "Integer[]":
                return new IntegerType(true);
            case "Double":
                return new DoubleType();
            case "Double[]":
                return new DoubleType(true);
            case "String":
                return new StringType();
            case "String[]":
                return new StringType(true);
            case "Boolean":
                return new BooleanType();
            case "Boolean[]":
                return new BooleanType(true);
            case "Vector2":
                return new Vector2Type();
            case "Vector2[]":
                return new Vector2Type(true);
            case "Color":
                return new ColorType();
            case "Color[]":
                return new ColorType(true);
            case "Entity":
                return new EntityType();
            case "Entity[]":
                return new EntityType(true);
            case "Void":
                return new VoidType();
            case "Void[]":
                return new VoidType(true);
            case "Array":
                return new ArrayType();
            default:
                return null;
        }
    }

    public boolean containsAttribute(String id) {
        for (Variable attr : this.attributes) {
            if (attr.getId().equals(id)) {
                return true;
            }
        }
        return false;
    }

    public Variable getAttribute(String id) {
        for (Variable attr : this.attributes) {
            if (attr.getId().equals(id)) {
                return attr;
            }
        }
        return null;
    }

    public List<Variable> getAttributes() {
        return attributes;
    }

    public boolean isArray() {
        return isArray;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName().replace("Type", "");
    }
}
