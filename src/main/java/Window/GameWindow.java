package Window;

import javax.swing.*;


public class GameWindow extends JFrame {
    Canvas2 canvas2=new Canvas2();

    public GameWindow()  {
        setSize(1196,740);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(canvas2);
    }
}
