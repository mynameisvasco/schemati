package com.schemati.backend.core;

import com.schemati.backend.entities.Entity;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractProgram {
    private Engine engine;
    protected List<Entity> mainEntityList = new ArrayList<>();
    public abstract void update();
    public abstract void start();
    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }
}