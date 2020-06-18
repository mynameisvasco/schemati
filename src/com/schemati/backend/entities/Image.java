package com.schemati.backend.entities;

import com.schemati.backend.core.Vector2;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Image extends Entity {
    private String imagePath;
    private BufferedImage bufferedImage;

    public Image(String tag, int rotation, String imagePath) {
        super(tag, Color.decode("#FFFFFF"), 0, 0, rotation);
        this.imagePath = imagePath;
        try {
            bufferedImage = ImageIO.read(new File(imagePath));
            this.width = bufferedImage.getWidth();
            this.height = bufferedImage.getHeight();
        } catch(IOException e) {
            System.out.println(e);
            System.exit(0);
        }
    }

    public Image(String tag, Vector2 position, String imagePath) {
        super(tag, 0, 0, Color.decode("#FFFFFF"), position);
        this.imagePath = imagePath;
        try {
            bufferedImage = ImageIO.read(new File(imagePath));
            this.width = bufferedImage.getWidth();
            this.height = bufferedImage.getHeight();
        } catch(IOException e) {
            System.out.println(e);
            System.exit(0);
        }
    }

    @Override
    public void render(Graphics g) {
        g.drawImage(bufferedImage, this.position.x, this.position.y, null);
    }
}
