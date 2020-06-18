package com.schemati.backend.entities;

import com.schemati.backend.core.Vector2;

import java.awt.*;

public class Rectangle extends Entity {

    public Rectangle(String tag, int width, int height, Color color) {
        super(tag, color, width, height, 0);
    }

    public Rectangle(String tag, int width, int height, Color color, Vector2 position) {
        super(tag, width, height, color, position);
    }

    @Override
    public void render(Graphics g) {
        g.setColor(this.color);
        g.fillRect(this.position.x, this.position.y, this.width, this.height);
    }
}
