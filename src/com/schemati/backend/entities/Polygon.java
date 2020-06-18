package com.schemati.backend.entities;

import com.schemati.backend.core.Vector2;

import java.awt.*;
import java.util.List;

public class Polygon extends Entity{
    private List<Vector2> vertices;
    private int[] xPoints;
    private int[] yPoints;

    public Polygon(String tag, Color color, int rotation, List<Vector2> vertices) {
        super(tag, color, 0, 0, rotation);
        this.vertices = vertices;
        calculateWidthAndHeight();
    }

    public Polygon(String tag, Color color, Vector2 position, List<Vector2> vertices) {
        super(tag, 0, 0, color, position);
        this.vertices = vertices;
        calculateWidthAndHeight();
    }

    @Override
    public void render(Graphics g) {
        calculateXandYPoints();
        g.setColor(this.color);
        g.fillPolygon(this.xPoints, this.yPoints, this.vertices.size());
    }

    private void calculateWidthAndHeight() {

        for(Vector2 p1 : vertices) {
            for(Vector2 p2 : vertices) {
                if(p1 == p2) continue;
                if(p1.distanceTo(p2) > this.width) {
                    this.width = p1.distanceTo(p2);
                    this.height = this.width;
                };
            }
        }
    }

    private void calculateXandYPoints()
    {
        this.xPoints = new int[this.vertices.size()];
        this.yPoints = new int[this.vertices.size()];
        int i = 0;
        for(Vector2 p : this.vertices) {
            this.xPoints[i] = this.position.getX() + p.getX();
            this.yPoints[i] = this.position.getY() + p.getY();
            i++;
        }
    }
}
