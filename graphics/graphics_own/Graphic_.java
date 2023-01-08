package graphics.graphics_own;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import static javax.swing.GroupLayout.Alignment.CENTER;
public class Graphic_ extends JFrame implements ActionListener
{    
    private JButton qb , jb ,q ;
    private JPopupMenu pm;
    public Graphic_()
    {
        init();
        setBackground(Color.black);
        PM();
    }

    private void init()
    {
        ImageIcon icc  = new ImageIcon("C:/Program Files/Windows Sidebar/Gadgets/SlideShow.Gadget/logo.png");
        qb= new JButton("Quit                     ",icc); 

        qb.addActionListener(this);

        jb = new JButton("JBUTTON");

        jb.addActionListener(this);

        q = new JButton("Input");
        q.addActionListener(this);

        createLayout(qb,jb,q);

        qb.setBackground(Color.red);

        setTitle("Aditya Srivastava JFrame");
        setSize(500,200);
        setResizable(false);

        setLocationRelativeTo(null);
    }

    private void PM()
    {
        pm = new JPopupMenu();

        JMenuItem mi = new JMenuItem("Minimize");
        JMenuItem re = new JMenuItem("Restore");
        JMenuItem ma = new JMenuItem("Maximize");

        mi.addActionListener(this);
        re.addActionListener(this);
        ma.addActionListener(this);

        addMouseListener(new MouseAdapter() 
            {
                public void mouseReleased(MouseEvent e) 
                {
                    if (e.getButton() == MouseEvent.BUTTON3) 
                    {
                        pm.show(e.getComponent(), e.getX(), e.getY());
                    }
                }
            });
        pm.add(mi);
        pm.add(re);
        pm.add(ma);
    }

    public void actionPerformed(ActionEvent ae)
    {
        String str = ae.getActionCommand();
        if(str.equals("Quit                     "))
        {
            System.exit(0);
        }
        else if(str.equals("JBUTTON"))
        {
            JOptionPane.showMessageDialog(null,"Hello Friends Chai Pilo","Message",JOptionPane.PLAIN_MESSAGE);
        }
        else if(str.equals("Input"))
        {
            String n=JOptionPane.showInputDialog("Write Something ...... ");
            if(Character.isLetterOrDigit(n.charAt(0)) || Character.isSpaceChar         (n.charAt(0))&&Character.isLetterOrDigit(n.charAt(1)))
            {
                JOptionPane.showMessageDialog(null,n,"Written in the Dialog Box",JOptionPane.PLAIN_MESSAGE);
            }
        }
        else if(str.equals("Maximize"))
        {
            if (getExtendedState() != JFrame.MAXIMIZED_BOTH) 
            {
                setExtendedState(JFrame.MAXIMIZED_BOTH);
            }
        }
        else if(str.equals("Minimize"))
        {
            if (getExtendedState() != JFrame.ICONIFIED) 
            {
                setExtendedState(JFrame.ICONIFIED);
            }
        }
        else if(str.equals("Restore"))
        {
            if (getExtendedState() != JFrame.NORMAL) 
            {
                setExtendedState(JFrame.NORMAL);
            }
        }

        repaint();
    }

    private void createLayout(JComponent... arg) 
    {
        Container pane = getContentPane();
        GroupLayout g1 = new GroupLayout(pane);
        pane.setLayout(g1);

        g1.setAutoCreateContainerGaps(true);
        g1.setAutoCreateGaps(true);

        g1.setHorizontalGroup(g1.createSequentialGroup()
            .addGroup(g1.createParallelGroup()
                .addComponent(arg[0])   
                .addGap(20)
                .addComponent(arg[1])
                .addComponent(arg[2]))
        );

        g1.setVerticalGroup(g1.createParallelGroup(CENTER)
            .addGroup(g1.createSequentialGroup()
                .addComponent(arg[0])
                .addGap(20)
                .addComponent(arg[1])
                .addComponent(arg[2]))
        );
        for(int x=0;x<=0    ;
        g1.linkSize(arg[x]),x++);

        pack();
    }

    public static void main()
    {
        EventQueue.invokeLater(()->
            {
                Graphic_ ex= new Graphic_();
                ex.setVisible(true); 
            });
    }
}