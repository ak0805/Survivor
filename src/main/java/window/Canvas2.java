package window;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.awt.Color;

public class Canvas2 extends JPanel {

    BufferedImage img;
    BufferedImage water;
    BufferedImage heart;
    BufferedImage fish;
    BufferedImage brain;
    public static final Color HUNGER = new Color(122, 65, 2);
    public static final Color HEALTH = new Color(255, 0, 0);
    public static final Color WATER = new Color(0, 128, 255);
    public static final Color BRAIN = new Color(255, 102, 179);

    public Canvas2() {
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        ClassLoader classLoader = getClass().getClassLoader();
        {
            try {
                String filePath = classLoader.getResource("game.jpg").getFile();
                File file = new File(filePath);
                img = ImageIO.read(file);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        {
            try {
                String filePath = classLoader.getResource("brain.png").getFile();
                File file = new File(filePath);
                brain = ImageIO.read(file);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        {
            try {
                String filePath = classLoader.getResource("drop.png").getFile();
                File file = new File(filePath);
                water = ImageIO.read(file);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        {
            try {
                String filePath = classLoader.getResource("heart.png").getFile();
                File file = new File(filePath);
                heart = ImageIO.read(file);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        {
            try {
                String filePath = classLoader.getResource("fish.png").getFile();
                File file = new File(filePath);
                fish = ImageIO.read(file);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        g.drawImage(img, 0, 0, null);
        g.drawImage(heart, 945, 35, 40, 40, null);
        g.drawImage(water, 940, 90, 50, 50, null);
        g.drawImage(fish, 945, 150, 44, 44, null);
        g.drawImage(brain, 930, 195, 70, 70, null);

        g.drawRect(1000, 46, 150, 22);
        g.drawRect(1000, 101, 150, 22);
        g.drawRect(1000, 161, 150, 22);
        g.drawRect(1000, 216, 150, 22);

        g.setColor(HEALTH);
        g.fillRect(1001, 47, 149, 21);
        g.setColor(WATER);
        g.fillRect(1001, 102, 149, 21);
        g.setColor(HUNGER);
        g.fillRect(1001, 162, 149, 21);
        g.setColor(BRAIN);
        g.fillRect(1001, 217, 149, 21);

    }

}

