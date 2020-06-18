package com.schemati.backend.entities;

public abstract class AbstractEntity {
    public String label;

    protected AbstractEntity(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }
}
