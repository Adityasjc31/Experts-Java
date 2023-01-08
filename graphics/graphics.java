package graphics;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class Surface_ extends JPanel
{
    public Surface_()
    {
        initSurface();
    }

    private void dodr(Graphics g)
    {
        Graphics2D gr = (Graphics2D) g;
        gr.drawLine(30,40,400,40);
        gr.drawLine(30,400,400,40);
        gr.drawLine(30,400,400,400);
    }

    private void initSurface() 
    {
        setBackground(Color.yellow);
    }

    public void paintComponent(Graphics g) 
    {
        super.paintComponent(g);
        dodr(g);
    }
}

public class graphics extends JFrame
{
    private graphics()
    {
        intui();
    }   

    private void intui()
    {
        add(new Surface_());

        setSize(600,500);
        setTitle("JFrame Java");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main()
    {
        EventQueue.invokeLater(new Runnable() 
            {
                public void run() 
                {
                    graphics ex = new graphics();
                    ex.setVisible(true);
                }
            });

    }
}