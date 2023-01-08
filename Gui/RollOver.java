package Gui;

import javax.swing.*;
import java.awt.*;
class RollOver extends JFrame
{
    private JButton t;
    public RollOver()
    {
        t=new JButton(new ImageIcon(getClass().getResource("_happypng.png")));
        t.setRolloverIcon(new ImageIcon(getClass().getResource("sad.png")));
        setLayout(new FlowLayout());
        add(t);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setLocationRelativeTo(null);
        pack();
    }
}