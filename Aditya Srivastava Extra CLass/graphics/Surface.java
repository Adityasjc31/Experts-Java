package graphics;

import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;
import javax.swing.*;
class Surface extends JPanel implements ActionListener
{
    private final Color colors [] = {Color.blue,Color.yellow,Color.gray,Color.pink,Color.green,Color.red,Color.orange};
    private Ellipse2D.Float[] ell;
    private double es[] , ms=0;
    private final int noe=25,de=30,inde=150;
    private Timer tr;
    private float est[];

    public Surface()
    {
        is();
        ie();
        it();
    }

    private void is()
    {
        setBackground(Color.black);
        ell = new Ellipse2D.Float[noe];
        es = new double[ell.length];
        est = new float[ell.length];
    }

    private void it()
    {
        tr=new Timer(de,this);
        tr.setInitialDelay(inde);
        tr.start();
    }

    private void posRandEllipses(int i,double s,int w,int h)
    {
        es[i]=s;est[i]=1.0f;
        double x=Math.random()*(w - ( ms / 2 ));
        double y=Math.random()*(h - ( ms / 2 ));
        ell[i].setFrame(x,y,s,s);
    }

    private void ie()
    {
        int w=350,h=250;
        ms=w/10;
        for(int i=0;i<ell.length;ell[i] = new Ellipse2D.Float(),posRandEllipses(i,ms*Math.random(),w,h),i++);
    }

    private void dst(int w,int h)
    {
        for(int i=0;i<ell.length;i++)
        {
            est[i]+=0.025f; es[i]++;
            if(es[i]>ms)
            {
                posRandEllipses(i,1,w,h);
            }
            else
            {
                ell[i].setFrame(ell[i].getX(),ell[i].getY(),es[i],es[i]);
            }
        }
    }

    private void dEllipses(Graphics2D gr)
    {
        for(int i=0;i<ell.length;i++)
        {
            gr.setColor(colors[i % colors.length]);
            gr.setStroke(new BasicStroke(est[i]));
            gr.draw(ell[i]);
        }
    }

    private void DD(Graphics g)
    {
        Graphics2D g2d =(Graphics2D)g.create();

        RenderingHints rh = new RenderingHints
            (RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);

        rh.put(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_RENDER_QUALITY);
        g2d.setRenderingHints(rh);

        Dimension size = new Dimension();
        DD(size.width,size.height);

        DEllipses(g2d);
        g2d.dispose();
    }

    public static void paintComponent(Graphics g)
    {
        super.Component(g);
        DD(g);
    }

    public void actionPerformed(ActionEvent e)
    {
        repaint();
    }
}