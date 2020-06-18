package com.schemati.backend.entities;

import com.schemati.backend.core.Vector2;
import com.schemati.backend.core.Renderable;

import java.awt.*;

public class Entity extends AbstractEntity  implements Renderable {
    public Vector2 position;
    public Color color;
    public Integer width, height, rotation;

    protected Entity(String tag, Color color, int width, int height, int rotation) {
        super(tag);
        this.color = color;
        this.position = new Vector2(0,0);
        this.width = width;
        this.height = height;
    }

    protected Entity(String tag, int width, int height, Color color, Vector2 position) {
        super(tag);
        this.color = color;
        this.width = width;
        this.height = height;
        this.position = position;
    }

    public Vector2 getPosition() {
        return position;
    }

    public void setPosition(Vector2 position) {
        this.position = position;
    }

    public void setPosition(int x, int y) { this.position = new Vector2(x, y); }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getRotation() {
        return rotation;
    }

    public void setRotation(int rotation) {
        this.rotation = rotation;
    }

    public Vector2 getCenter() {
        return new Vector2(
                this.getPosition().getX() + this.getWidth() / 2,
                this.getPosition().getY() + this.getHeight() /2
        );
    }

    @Override
    public void render(Graphics g) {

    }
}
