package graphics;

import java.awt.*;
import java.awt.event.*;
import java.awt.geom.Ellipse2D;
import javax.swing.*;
class Surface extends JPanel implements ActionListener
{

    private final Color colors[] = {
            Color.blue, Color.cyan, Color.green,
            Color.magenta, Color.orange, Color.pink,
            Color.red, Color.yellow, Color.lightGray, Color.white
        };

    private Ellipse2D.Float[] ellipses;
    private double esize[];
    private float est[];
    private double maxSize = 0;
    private final int NUMBER_OF_ELLIPSES = 25;
    private final int de = 30;
    private final int INITIAL_DELAY = 150;    
    private Timer timer;

    public Surface() {

        initSurface();
        initEllipses();
        initTimer();
    }

    private void initSurface() {

        setBackground(Color.black);
        ellipses = new Ellipse2D.Float[NUMBER_OF_ELLIPSES];
        esize = new double[ellipses.length];
        est = new float[ellipses.length];
    }

    private void initEllipses() {

        int w = 350;
        int h = 250;

        maxSize = w / 10;

        for (int i = 0; i < ellipses.length;i++)
        {
            ellipses[i] = new Ellipse2D.Float();
            posRandEllipses(i, maxSize * Math.random(), w, h);
        }
    }

    private void initTimer() {

        timer = new Timer(de, this);
        timer.setInitialDelay(INITIAL_DELAY);
        timer.start();
    }

    private void posRandEllipses(int i, double size, int w, int h) {

        esize[i] = size;
        est[i] = 1.0f;
        double x = Math.random() * (w - (maxSize / 2));
        double y = Math.random() * (h - (maxSize / 2));
        ellipses[i].setFrame(x, y, size, size);
    }

    private void doStep(int w, int h) {

        for (int i = 0; i < ellipses.length; i++) {

            est[i] += 0.025f;
            esize[i]++;

            if (esize[i] > maxSize) {

                posRandEllipses(i, 1, w, h);
            } else {

                ellipses[i].setFrame(ellipses[i].getX(), ellipses[i].getY(),
                    esize[i], esize[i]);
            }
        }
    }

    private void drawEllipses(Graphics2D gr) {

        for (int i = 0; i < ellipses.length; i++) {

            gr.setColor(colors[i % colors.length]);
            gr.setStroke(new BasicStroke(est[i]));
            gr.draw(ellipses[i]);
        }
    }

    private void doDrawing(Graphics g) {

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

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        doDrawing(g);
    }

    public void actionPerformed(ActionEvent e) {

        repaint();
    }
}

public class Bubbles extends JFrame {

    public Bubbles() {

        initUI();
    }

    private void initUI() {

        add(new Surface());

        setTitle("JFrame Bubbles");
        setSize(350, 250);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String args[]) {

        EventQueue.invokeLater(new Runnable() {
                public void run() {

                    Bubbles ex = new Bubbles();
                    ex.setVisible(true);
                }
            });
    }
}