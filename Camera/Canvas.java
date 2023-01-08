package Camera;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Canvas extends JFrame
{
    private Surface sur = new Surface();
    public Canvas()
    {
        add(sur);
        setSize(550,250);
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public class Surface extends JPanel
    {
        private Graphics2D g2d;

        public void paint(Graphics g)
        {
            g2d = (Graphics2D)g;
            g2d.setColor(Color.BLACK);
            g2d.fillRect(getX(),getY(),getWidth(),getHeight());
        }
    }
}