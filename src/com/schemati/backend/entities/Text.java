package com.schemati.backend.entities;

import com.schemati.backend.core.Vector2;

import java.awt.*;

public class Text extends Entity {
    private Integer size;
    public Text(String tag, Color color, int rotation) {
        super(tag, color, 0, 0, rotation);
        this.width = this.label.length() * this.size;
        this.height = this.size;
    }

    public Text(String tag, int size, Color color, Vector2 position) {
        super(tag, 0, 0, color, position);
        this.size = size;
        this.width = this.label.length() * this.size;
        this.height = this.size;
    }

    @Override
    public void render(Graphics g) {
        g.setColor(this.color);
        g.setFont(new Font("Arial", Font.PLAIN, this.size));
        g.drawString(this.label, this.position.x, this.position.y);
    }
}
