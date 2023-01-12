package teams;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.awt.event.*;
import javax.imageio.*;
import java.io.*;
public class Screenshot
{
    public Screenshot()
    {
    }
    
    public void screenShot()throws AWTException,IOException
    {
        String path = "C:\\Shot.jpg";
        Robot r = new Robot();
        Rectangle capture = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
        BufferedImage image= r.createScreenCapture(capture);
        ImageIO.write(image,"jpg",new File(path));
    }
}