package com.schemati.backend.core;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class

Scene extends JFrame implements KeyListener, MouseListener {
    public Canvas canvas;
    private double scale;
    private Input input;
    private Engine engine;
    private Color background;
    /**
     * @param width  GraphicEngine width
     * @param height GraphicEngine height
     */
    public Scene(String title, int width, int height, double scale, Color background) {
        this.setTitle(title);
        this.setSize(width, height);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.scale = scale;
        this.setLayout(new BorderLayout());
        Dimension size = new Dimension(width, height);
        this.canvas = new Canvas();
        this.canvas.setSize(size);
        this.canvas.setMaximumSize(size);
        this.canvas.setMinimumSize(size);
        this.canvas.backgroundColor = background;
        this.add(canvas);
        this.addKeyListener(this);
        this.addMouseListener(this);
        this.input = new Input();
        this.background = background;
        this.engine = new Engine(this, this.input);
        this.canvas.setVisible(true);
        this.setVisible(true);
    }

    public double getScale() {
        return scale;
    }

    public Engine getEngine() {
        return engine;
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        this.input.keyDown(e.getKeyCode());
    }

    @Override
    public void keyReleased(KeyEvent e) {
        this.input.keyUp(e.getKeyCode());
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
