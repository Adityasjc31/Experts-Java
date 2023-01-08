package graphics;

import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;
import javax.swing.*;
class Surfing extends JPanel implements ActionListener
{
    private final Color colors[]={Color.blue,Color.yellow,Color.orange,Color.magenta,Color.green ,Color.pink,Color.lightGray,Color.white};
    private Ellipse2D.Float[] ellipses;
    private double es[],ms=0;
    private final int noe=25,de=30,inde=150;
    private Timer tr;
    private float est[];

    public Surfing()
    {
        is();ie();it();
    }

    private void is()
    {
        setBackground(Color.black);
        ellipses = new Ellipse2D.Float[noe];
        es=new double[ellipses.length];
        est = new float[ellipses.length];
    }

    private void ie()
    {
        int w=650,h=500;
        ms=w/10;
        for(int x=0;x < ellipses.length;ellipses[x]=new Ellipse2D.Float(),
            posRandEllipses(x,ms*Math.random(),w,h),x++);
    }

    private void it()
    {
        tr = new Timer(de,this);
        tr.setInitialDelay(inde);
        tr.start();
    }
    
    private void posRandEllipses(int i , double size,int w,int h)
    {
        es[i]=size;est[i]=1.0f;
        double x=Math.random() * (w - (ms / 2));
        double y=Math.random() * (h - (ms / 2));
        ellipses[i].setFrame(x,y,size,size);
    }

    private void doStep(int w, int h) 
    {
        for (int i = 0; i < ellipses.length; i++) 
        {
            est[i] += 0.025f;
            es[i]++;
            if (es[i] > ms)
            {
                posRandEllipses(i, 1, w, h);
            }
            else 
            {
                ellipses[i].setFrame(ellipses[i].getX(), ellipses[i].getY(),
                    es[i], es[i]);
            }
        }
    }

    private void drawEllipses(Graphics2D gr) 
    {
        for (int i = 0; i < ellipses.length; i++) 
        {
            gr.setColor(colors[i % colors.length]);
            gr.setStroke(new BasicStroke(est[i]));
            gr.draw(ellipses[i]);
        }
    }

    private void doDrawing(Graphics g) 
    {
        Graphics2D g2d = (Graphics2D) g.create();

        RenderingHints rh
        = new RenderingHints(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);

        rh.put(RenderingHints.KEY_RENDERING,
            RenderingHints.VALUE_RENDER_QUALITY);

        g2d.setRenderingHints(rh);

        Dimension size = getSize();
        doStep(size.width, size.height);
        drawEllipses(g2d);

        g2d.dispose();
    }

    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        doDrawing(g);
    }

    public void actionPerformed(ActionEvent e) 
    {
        repaint();
    }
}

public class Eventer extends JFrame
{    
    public Eventer() 
    {
        initUI();
    }

    private void initUI() 
    {
        add(new Surfing());
        setTitle("JFrame Bubbles");
        setSize(650,500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main() 
    {
        EventQueue.invokeLater(new Runnable() {
                public void run() 
                {
                    Eventer ex = new Eventer();
                    ex.setVisible(true);
                }
            });
    }
}