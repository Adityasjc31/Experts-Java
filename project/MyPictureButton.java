package project;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.image.*;
import javax.imageio.*;
import java.io.*;
class MyPictureButton extends JButton
{
    private BufferedImage original,lastBufferedImage;
    private ImageIcon buffered;
    String path;
    int width,height;
    public MyPictureButton()
    {
        init();
    }

    public MyPictureButton(String path,int x,int y,int width,int height)
    {
        super(new CorrectingPixels().resizingImage(new CorrectingPixels().getImage(path),x,y,width,height,BufferedImage.TYPE_INT_ARGB));
        original=new CorrectingPixels().getImage(path);
        this.path=path;
        init();
    }

    public MyPictureButton(String path)
    {
        super(new ImageIcon(path));
        original=new CorrectingPixels().getImage(path);
        this.path=path;
        init();
    }

    public MyPictureButton(MyPictureButton ob)
    {
        super(new CorrectingPixels().imageGiven(ob.getBufferedImage("lastBufferedImage"),ob.width,ob.height,BufferedImage.TYPE_INT_ARGB));
        original=new CorrectingPixels().getImage(path);
        this.path=ob.getPath();
        init();
    }

    public MyPictureButton(String path,int width,int height)
    {
        super(new CorrectingPixels().resizingImage(new CorrectingPixels().getImage(path),width,height,BufferedImage.TYPE_INT_ARGB));
        original=new CorrectingPixels().getImage(path);
        width=width;
        height=height;
        this.path=path;
        init();
    }

    public MyPictureButton(MyPictureButton ob,int width,int height)
    {
        super(new CorrectingPixels().imageGiven(ob.getBufferedImage("lastBufferedImage"),width,height,BufferedImage.TYPE_INT_ARGB));
        original=new CorrectingPixels().getImage(path);
        width=width;
        height=height;
        this.path=ob.getPath();
        init();
    }

    public void cropImage(int x,int y,int w,int h)
    {
        BufferedImage crop = original.getSubimage(x,y,w,h);
        ImageIcon imageNew = new ImageIcon(crop);
        buffered=imageNew;
        lastBufferedImage=crop;
        setIcon(imageNew);
    }

    public ImageIcon getImageIcon()
    {
        return buffered;
    }

    public String getPath()
    {   
        return path;
    }

    public BufferedImage getBufferedImage(String s)
    {
        if(s!=null && s.equalsIgnoreCase("lastBufferedImage"))
        {
            return lastBufferedImage;
        }
        else
        {
            return original;
        }
    }

    private void init()
    {
        BorderFactory.createLineBorder(Color.gray, 3);
        addMouseListener(new MouseAdapter()
            {
                public void mouseEntered(MouseEvent e)
                {
                    BorderFactory.createLineBorder(Color.red,3);
                }

                public void mouseExited(MouseEvent e)
                {
                    BorderFactory.createLineBorder(Color.gray,3);
                }

            }
        );
    }
}

class CorrectingPixels
{
    int width;
    int height;
    public int getWidth()
    {
        return width;
    }
    
    public int getHeight()
    {
        return height;
    }
    
    ImageIcon imageGiven(BufferedImage i,int width,int height,int type)
    {
        return resizingImage(i,width,height,type);
    }

    BufferedImage getImage(String path)
    {
        BufferedImage bil=null;
        try
        {
            bil=ImageIO.read(new File(path));
        }
        catch(Exception e)
        {
        }
        return bil;
    }

    ImageIcon resizingImage(BufferedImage obi,int width,int height,int type)
    {
        BufferedImage bi  = new BufferedImage(width,height,type);
        Graphics2D g = bi.createGraphics();
        g.drawImage(obi,0,0,width,height,null);
        g.dispose();
        Image ii=bi;
        ImageIcon i=new ImageIcon(ii);
        width=bi.getWidth();
        height=bi.getHeight();
        return i; 
    }

    ImageIcon resizingImage(BufferedImage obi,int x,int y,int width,int height,int type)
    {
        BufferedImage bi  = new BufferedImage(width,height,type);
        Graphics2D g = bi.createGraphics();
        g.drawImage(obi,x,y,width,height,null);
        g.dispose();
        Image ii=bi;
        ImageIcon i=new ImageIcon(ii);
        width=bi.getWidth();
        height=bi.getHeight();
        
        return i; 
    }
}