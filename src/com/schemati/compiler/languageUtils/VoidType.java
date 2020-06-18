package com.schemati.compiler.languageUtils;

public class VoidType extends Type {
    private boolean isArray;

    public VoidType() {
        super(false);
        this.isArray = false;
    }

    public VoidType(boolean isArray) {
        super(isArray);
        this.isArray = isArray;
    }

    @Override
    public boolean canAssign(Type t) {
        return t instanceof VoidType;
    }
}
