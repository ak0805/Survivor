package window;

import javax.swing.*;
import java.awt.event.*;

public class NewWindow extends JFrame implements ActionListener {
    Canvas canvas = new Canvas();
    GameWindow gameWindow = new GameWindow();

    public NewWindow() {
        super("Survivor Game");
        canvas.setLayout(null);
        JTextArea textField = new JTextArea();
        textField.setBounds(235, 220, 200, 20);
        JButton startButton = new JButton("START GAME");
        startButton.setBounds(235, 250, 200, 50);
        startButton.addActionListener(e -> {
            setVisible(false);
            gameWindow.setVisible(true);
        });


        setSize(654, 436);
        setResizable(false);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        canvas.add(textField);
        canvas.add(startButton);
        add(canvas);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
