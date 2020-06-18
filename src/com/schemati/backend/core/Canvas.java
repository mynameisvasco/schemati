package com.schemati.backend.core;

import com.schemati.backend.entities.Entity;

import javax.swing.*;
import java.awt.*;

public class Canvas extends JPanel {

    public AbstractProgram program;
    public Color backgroundColor;

    @Override
    protected void paintComponent(Graphics g) {
        if(program != null) {
            g.setColor(backgroundColor);
            g.fillRect(0, 0, this.getWidth(), this.getHeight());
            for (Entity e : program.mainEntityList) {
                e.render(g);
            }
        }
    }
}
