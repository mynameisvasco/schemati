package com.schemati.compiler.languageUtils;

public class StringType extends Type {
    public StringType() {
        super(false);
        this.isArray = false;
        this.attributes.add(new Variable(Type.fromString("Integer"), "length"));
    }

    public StringType(boolean isArray) {
        super(isArray);
        this.isArray = isArray;
        this.attributes.add(new Variable(Type.fromString("Integer"), "length"));
    }

    @Override
    public boolean canAssign(Type t) {
        return (!this.isArray && !t.isArray && t instanceof StringType) ||
                (this.isArray && t.isArray && t instanceof StringType) ||
                (this.isArray && t instanceof ArrayType);
    }

    @Override
    public boolean canCompareWith(Type t) {
        return t instanceof StringType;
    }
}
