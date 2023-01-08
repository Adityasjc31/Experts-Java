package graphics.graphics_own;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class Wait_Method extends JPanel implements ActionListener
{
    Timer ti;
    int count;
    final int ide=200,de=80,nl=8,sw=3;
    final double[][] trs=
        {
            {0.0, 0.15, 0.30, 0.5, 0.65, 0.80, 0.9, 1.0},

            {1.0, 0.0, 0.15, 0.30, 0.5, 0.65, 0.8, 0.9},

            {0.9, 1.0, 0.0, 0.15, 0.3, 0.5, 0.65, 0.8},

            {0.8, 0.9, 1.0, 0.0, 0.15, 0.3, 0.5, 0.65},

            {0.65, 0.8, 0.9, 1.0, 0.0, 0.15, 0.3, 0.5},

            {0.5,0.65,0.8,0.9,1.0,0.0,0.15,0.3},

            {0.3,0.5,0.65,0.8,0.9,1.0,0.0,0.15},

            {0.15,0.3,0.5,0.65,0.8,0.9,1.0,0.0}
        };
    public Wait_Method()
    {
        iT();
    }

    private void iT()
    {
        ti=new Timer(de,this);
        ti.setInitialDelay(ide);
        ti.start();
    }

    private void doDr(Graphics g)
    {
        Graphics2D g2d = (Graphics2D) g.create();

        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
            RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setRenderingHint(RenderingHints.KEY_RENDERING,
            RenderingHints.VALUE_RENDER_QUALITY);

        int width = getWidth();
        int height = getHeight();

        g2d.setStroke(new BasicStroke(sw, BasicStroke.CAP_ROUND,
                BasicStroke.JOIN_ROUND));
        g2d.translate(width / 2, height / 2);

        for (int i = 0; i <nl; i++) 
        {
            float alpha = (float) trs[count % nl][i];
            AlphaComposite acomp = AlphaComposite.getInstance(
                    AlphaComposite.SRC_OVER, alpha);
            g2d.setComposite(acomp);

            g2d.rotate(Math.PI / 4f);
            g2d.drawLine(0, -10, 0, -40);
        }

        g2d.dispose();
    }

    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        doDr(g);
    }

    public void actionPerformed(ActionEvent e)
    {
        repaint();
        count++;
    }
}

public class Wait_ extends JFrame 
{
    public Wait_() 
    {
        initUI();
    }

    private void initUI()
    {
        add(new Wait_Method());

        setTitle("Waiting");
        setSize(300, 200);
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) 
    {
        EventQueue.invokeLater(new Runnable() 
            {
                @Override
                public void run() {

                    Wait_ ex = new Wait_();
                    ex.setVisible(true);
                }
            });
    }
}