package com.schemati.compiler.languageUtils;

public class BooleanType extends Type {

    public BooleanType() {
        super(false);
        this.isArray = false;
    }

    public BooleanType(boolean isArray) {
        super(isArray);
        this.isArray = isArray;
    }

    @Override
    public boolean canAssign(Type t) {
        return (!this.isArray && !t.isArray && t instanceof BooleanType) ||
                (this.isArray && t.isArray && t instanceof BooleanType) ||
                (this.isArray && t instanceof ArrayType);
    }

    @Override
    public boolean canCompareWith(Type t) {
        return t instanceof BooleanType;
    }
}
