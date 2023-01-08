package graphics.graphics_own;

import java.awt.*;
import javax.swing.*;

class Graphics_3 extends JFrame
{
    public Graphics_3()
    {
        gui();
    }
    
    private  void gui()
    {
        ImageIcon webIcon = new ImageIcon("C:/Program Files (x86)/Google/Chrome/Application/67.0.3396.99/VisualElements/logo.png");
        setIconImage(webIcon.getImage());
        setTitle("Aditya Srivatava Jframe");
        setSize(350,250);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    public static void main()
    {
        EventQueue.invokeLater(()->
        {
            Graphics_3 ex = new Graphics_3();
            ex.setVisible(true);
        });
    }
}