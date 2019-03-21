package window;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Canvas extends JPanel {

    BufferedImage img;


    public Canvas() {
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        {
            try {
                ClassLoader classLoader = getClass().getClassLoader();
                String filePath = classLoader.getResource("island.jpg").getFile();
                File file = new File(filePath);
                img = ImageIO.read(file);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


        g.drawImage(img,0,0,getWidth(),getHeight(),null);



    }
}
