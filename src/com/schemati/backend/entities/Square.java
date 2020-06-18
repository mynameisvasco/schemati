package com.schemati.backend.entities;

import com.schemati.backend.core.Vector2;

import java.awt.*;

public class Square extends Rectangle{

    public Square(String tag, int width, Color color) {
        super(tag, width, width, color);
    }

    public Square(String tag, int width, Color color, Vector2 position) {
        super(tag, width, width, color, position);
    }
}
