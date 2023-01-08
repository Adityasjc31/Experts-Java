package graphics.graphics_own.Applet;

import java.awt.*;
import java.applet.*;
/*
<applet code="Sample" width=300 height=50>
</applet>
 */
public class App_Starting extends Applet
{
    String msg;
    public void init()
    {
        setBackground(Color.cyan);
        setForeground(Color.red);
        msg = "Inside gui() --";
    }

    public void start()
    {
        msg+=" Inside start() --";
    }

    public void paint(Graphics g)
    {
        msg+=" Inside paint().";
        g.drawString(msg , 10 ,30);
    }
}