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
                img = ImageIO.read(new File("wyspa.jpg"));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


        g.drawImage(img,0,0,getWidth(),getHeight(),null);



    }
}
