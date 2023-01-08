package graphics.graphics_own.Applet;

import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class AD extends Applet implements ActionListener
{
    Button qb;
    public void init()
    {
        qb= new Button("Quit"); 
        qb.addActionListener(this);
        add(qb);
    }

    public void actionPerformed(ActionEvent se)
    {
        String str=se.getActionCommand();
        if(str.equals("Quit"))
        {
            System.exit(0);
        }
        repaint();
    }
}