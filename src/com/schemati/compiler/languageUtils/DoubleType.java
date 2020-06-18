package com.schemati.compiler.languageUtils;

public class DoubleType extends Type {
    public DoubleType() {
        super(false);
        this.isArray = false;
    }

    public DoubleType(boolean isArray) {
        super(isArray);
        this.isArray = isArray;
    }

    @Override
    public boolean canAssign(Type t) {
        return (!this.isArray && !t.isArray && t instanceof ColorType) ||
                (this.isArray && t.isArray && t instanceof ColorType) ||
                (this.isArray && t instanceof ArrayType);
    }

    @Override
    public boolean canAlgebricWith(Type t) {
        return t instanceof DoubleType;
    }

    @Override
    public boolean canCompareWith(Type t) {
        return t instanceof DoubleType;
    }

    @Override
    public boolean canUnary() {
        return true;
    }
}
