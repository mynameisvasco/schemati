package com.schemati.backend.core;

import javax.swing.*;

public class Engine implements Runnable {
    private Scene parentScene;
    private Thread thread;
    private boolean running;
    private long ellapsedMillis = 0;
    private Input input;
    public AbstractProgram abstractProgram;

    public Engine(Scene parentScene, Input input) {
        this.parentScene = parentScene;
        this.input = input;
        this.thread = new Thread(this);
    }

    public void start()
    {
        this.parentScene.canvas.program = this.abstractProgram;
        this.abstractProgram.start();
        this.thread.start();
    }

    @Override
    public void run() {
        running = true;
        boolean render = false;
        double firstTime = 0;
        double lastTime = System.nanoTime() / 1000000000.0;
        double passedTime = 0;
        double unprocessedTime = 0;

        while (running) {
            render = false;
            firstTime = System.nanoTime() / 1000000000.0;
            passedTime = firstTime - lastTime;
            lastTime = firstTime;

            unprocessedTime += passedTime;
            this.update();

            while(unprocessedTime >= 1/60.0f) {
                unprocessedTime -= 1/60.0f;
                render = true;
            }
            if(render) {
                SwingUtilities.invokeLater(new Runnable() {
                    @Override
                    public void run() {
                        parentScene.canvas.repaint();
                    }
                });
            } else {
                try {
                    ellapsedMillis += 20;
                    Thread.sleep(20);
                } catch(InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public void update() {
        if(abstractProgram != null) {
            abstractProgram.update();
        }
    }

    public Input getInput() {
        return input;
    }

    public void setInput(Input input) {
        this.input = input;
    }

    public void setAbstractProgram(AbstractProgram abstractProgram) {
        this.abstractProgram = abstractProgram;
        this.abstractProgram.setEngine(this);
    }

    public long getEllapsedMillis() {
        return ellapsedMillis;
    }

    public Scene getParentScene() {
        return parentScene;
    }
}
