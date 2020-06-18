package com.schemati.compiler.languageUtils;

public class Vector2Type extends Type {
    public Vector2Type() {
        super(false);
        this.isArray = false;
        this.attributes.add(new Variable(Type.fromString("Integer"), "x"));
        this.attributes.add(new Variable(Type.fromString("Integer"), "y"));
    }

    public Vector2Type(boolean isArray) {
        super(isArray);
        this.isArray = isArray;
        this.attributes.add(new Variable(Type.fromString("Integer"), "x"));
        this.attributes.add(new Variable(Type.fromString("Integer"), "y"));
    }

    @Override
    public boolean canAssign(Type t) {
        return (!this.isArray && !t.isArray && t instanceof Vector2Type) ||
                (this.isArray && t.isArray && t instanceof Vector2Type) ||
                (this.isArray && t instanceof ArrayType);
    }

    @Override
    public boolean canCompareWith(Type t) {
        return t instanceof Vector2Type;
    }
}
