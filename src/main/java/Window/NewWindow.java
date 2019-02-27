package Window;

import javax.swing.*;
import java.awt.*;

public class NewWindow extends JFrame {
    private JPanel panel;
    public NewWindow() {
        super("Survivor game");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);
        panel = new JPanel();
        panel.setLayout(null);

        add(panel);

    }
    public void PaintComponent(Graphics g){
        super.paintComponents(g);
        Graphics2D g2d =(Graphics2D) g;
        g2d.drawRect(10,10,200,200);
    }


}
