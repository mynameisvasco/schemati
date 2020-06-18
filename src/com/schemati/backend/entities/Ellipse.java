package com.schemati.backend.entities;

import com.schemati.backend.core.Vector2;

import java.awt.*;

public class Ellipse extends Entity {

    public Ellipse(String tag, Color color, int width, int height, int rotation) {
        super(tag, color, width, height, rotation);
    }

    public Ellipse(String tag, int width, int height, Color color, Vector2 position) {
        super(tag, width, height, color, position);
    }

    @Override
    public void render(Graphics g) {
        g.setColor(this.color);
        g.fillOval(this.position.getX(), this.position.getY(), this.width, this.height);
    }
}
