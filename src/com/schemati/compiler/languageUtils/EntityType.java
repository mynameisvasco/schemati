package com.schemati.compiler.languageUtils;

public class EntityType extends Type {
    public EntityType() {
        super(false);
        this.isArray = false;
        this.attributes.add(new Variable(Type.fromString("String"), "label"));
        this.attributes.add(new Variable(Type.fromString("Integer"), "width"));
        this.attributes.add(new Variable(Type.fromString("Integer"), "height"));
        this.attributes.add(new Variable(Type.fromString("Color"), "color"));
        this.attributes.add(new Variable(Type.fromString("Vector2"), "position"));
    }

    public EntityType(boolean isArray) {
        super(isArray);
        this.isArray = isArray;
        this.attributes.add(new Variable(Type.fromString("String"), "label"));
        this.attributes.add(new Variable(Type.fromString("Integer"), "width"));
        this.attributes.add(new Variable(Type.fromString("Integer"), "height"));
        this.attributes.add(new Variable(Type.fromString("Color"), "color"));
        this.attributes.add(new Variable(Type.fromString("Vector2"), "position"));
    }

    @Override
    public boolean canAssign(Type t) {
        return (!this.isArray && !t.isArray && t instanceof EntityType) ||
                (this.isArray && t.isArray && t instanceof EntityType) ||
                (this.isArray && t instanceof ArrayType);
    }

    @Override
    public boolean canAddToArray(Type t) {
        return (this.isArray && t instanceof EntityType);
    }

    @Override
    public boolean canCompareWith(Type t) {
        return t instanceof EntityType;
    }
}
