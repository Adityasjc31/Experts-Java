package graphics.graphics_own;

import java.awt.*;
import javax.swing.*;

class Graphics_1 extends JFrame
{
    public Graphics_1()
    {
        gui();
    }
    
    private  void gui()
    {
        setTitle("Aditya Srivatava Jframe");
        setSize(350,250);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    public static void main()
    {
        EventQueue.invokeLater(()->
        {
            Graphics_1 ex = new Graphics_1();
            ex.setVisible(true);
        });
    }
}