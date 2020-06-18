package com.schemati.compiler.languageUtils;

public class ColorType extends Type {
    public ColorType() {
        super(false);
        this.isArray = false;
    }

    public ColorType(boolean isArray) {
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
    public boolean canCompareWith(Type t) {
        return t instanceof ColorType;
    }
}
