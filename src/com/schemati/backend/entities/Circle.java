package com.schemati.backend.entities;

import com.schemati.backend.core.Vector2;

import java.awt.*;

public class Circle extends Ellipse {

    public Circle(String tag, Color color, int radius) {
        super(tag, color, radius*2, radius*2, 0);
    }

    public Circle(String tag, int radius, Color color, Vector2 position) {
        super(tag, radius * 2, radius * 2, color, position);
    }
}
