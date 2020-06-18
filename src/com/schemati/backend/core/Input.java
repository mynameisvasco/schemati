package com.schemati.backend.core;

public class Input {
    boolean[] keys = new boolean[255];

    public void keyDown(int code) {
        keys[code] = true;
    }

    public void keyUp(int code) {
        keys[code] = false;
    }

    public boolean isKey(int code) {
        return keys[code];
    }
}
