package com.schemati.compiler.languageUtils;

public class IntegerType extends Type {
    public IntegerType() {
        super(false);
        this.isArray = false;
    }

    public IntegerType(boolean isArray) {
        super(isArray);
        this.isArray = isArray;
    }

    @Override
    public boolean canAssign(Type t) {
        return (!this.isArray && !t.isArray && t instanceof IntegerType) ||
                (this.isArray && t.isArray && t instanceof IntegerType) ||
                (this.isArray && t instanceof ArrayType);
    }

    @Override
    public boolean canAlgebricWith(Type t) {
        return t instanceof IntegerType;
    }

    @Override
    public boolean canCompareWith(Type t) {
        return t instanceof IntegerType;
    }

    @Override
    public boolean canUnary() {
        return true;
    }
}
