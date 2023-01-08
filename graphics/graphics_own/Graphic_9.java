package graphics.graphics_own;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Graphic_9 extends JFrame
{    
    private JPopupMenu pm;
    private JLabel statusbar;

    public Graphic_9()
    {
        gui();
    }

    private  void gui()
    {
        cMB();cPM(); 
        JButton wa=new JButton("Text");
        wa.addActionListener((ActionEvent e) ->
            {
                EventQueue.invokeLater(()->
                    {
                        Text ex = new Text();
                        //Wait_ e1 = new Wait_();
                        ex.setVisible(true);
                        //e1.setVisible(true);
                    });
            });

        JButton qb = new JButton("Quit");  
        qb.addActionListener((ActionEvent e) ->
            {
                System.exit(0);
            });

        JButton qb1 = new JButton("Message");
        JButton qb2 = new JButton("File");

        JButton qb3 = new JButton("View");
        JButton qb4 = new JButton("Love");
        JButton qb5 = new JButton("Java");
        ImageIcon ic = new ImageIcon("C:/Program Files/Windows Sidebar/Gadgets/SlideShow.Gadget/logo.png");

        qb.setBackground(Color.orange);
        qb2.setBackground(Color.green);
        qb1.setBackground(Color.red);

        qb3.setBackground(Color.gray);
        qb4.setBackground(Color.gray);
        qb5.setBackground(Color.gray);

        qb1.addActionListener((ActionEvent e) ->
            {
                JOptionPane.showMessageDialog(null,"Hello friends Chai Pilo");
            });

        qb2.addActionListener((ActionEvent e)->
            {
                UIManager.put("OptionPane.inputFont", new Font("Arial", Font.BOLD, 11)
                );
                String n = JOptionPane.showInputDialog("Item");
            });
        createLayout(qb,qb1,qb2,qb3,qb4,qb5,wa);

        setIconImage(ic.getImage());
        setTitle("Aditya Srivastava JFrame");
        setSize(500,200);
        setResizable(false);

        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private void cMB()
    {
        JMenuBar jmb = new JMenuBar();
        JMenu f = new JMenu("File");

        JMenu im = new JMenu("Import");

        JMenuItem i0,i00,i000;
        i0 = new JMenuItem("Package java.lang");
        i00 = new JMenuItem("Package java.awt");
        i000 = new JMenuItem("Package javax.swing");

        i0.setBackground(Color.gray);
        i00.setBackground(Color.gray);
        i000.setBackground(Color.gray);

        im.add(i0);im.add(i00);im.add(i000);
        JMenuItem i1,i2,i3,i4; 
        i1= new JMenuItem("New");
        i2= new JMenuItem("Open");
        i3= new JMenuItem("Save");
        i4= new JMenuItem("Exit");

        i1.setBackground(Color.gray);
        i2.setBackground(Color.gray);
        i3.setBackground(Color.gray);

        f.add(i1);f.add(i2);f.add(i3);f.addSeparator();f.add(im);f.addSeparator();f.add(i4);

        i4.setToolTipText("Exit Application");

        i4.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_W,
                ActionEvent.CTRL_MASK));

        i4.addActionListener((ActionEvent event) ->
            {
                System.exit(0);
            });

        JMenu v = new JMenu("View");

        JMenuItem j1,j2,j3,j4;
        ImageIcon ii = new ImageIcon("C:/Users/Aditya/Pictures/backgrounddefault.png");

        j1=new JMenuItem("Image");
        j1.addActionListener((ActionEvent e1)->
            {
                JOptionPane.showMessageDialog(null,
                    ii,"Image",JOptionPane.PLAIN_MESSAGE);
            });

        j2=new JMenuItem("Random Data");
        j2.setBackground(Color.gray);
        j3=new JMenuItem("Compiler of Java");
        j4=new JMenuItem("Interpeter of Java");

        v.add(j1);v.add(j2);v.addSeparator();v.add(j3);v.add(j4);
        j3.setToolTipText("To What does Java Compiler consist of");
        Stri s = new Stri();
        String u=s.u();
        j3.addActionListener((ActionEvent e) ->
            {
                JOptionPane.showMessageDialog(null,u,
                    "Compiler of java",JOptionPane.PLAIN_MESSAGE);
            });
        j4.setToolTipText("To What does Java Interpeter consist of");
        String n=s.u1();
        j4.addActionListener((ActionEvent e) ->
            {
                UIManager.put("OptionPane.messageFont", new Font("Arial", Font.BOLD, 11)
                );

                JOptionPane.showMessageDialog(null,n,
                    "Interpeter of java",JOptionPane.PLAIN_MESSAGE);
            });
        JMenu t = new JMenu("Tools");
        JMenu ey = new JMenu("Edit");
        JMenu h = new JMenu("Help");

        JMenu difMenu = new JMenu("Difficulty");
        difMenu.setMnemonic(KeyEvent.VK_F);

        ButtonGroup difGroup = new ButtonGroup();

        JRadioButtonMenuItem eaRMi = new JRadioButtonMenuItem("Easy");
        eaRMi.setSelected(true);
        difMenu.add(eaRMi);

        eaRMi.addItemListener((ItemEvent e) -> 
            {
                if (e.getStateChange() == ItemEvent.SELECTED) 
                {
                    statusbar.setText("Easy");
                }
            });

        JRadioButtonMenuItem meRMi = new JRadioButtonMenuItem("Medium");
        difMenu.add(meRMi);

        meRMi.addItemListener((ItemEvent e) -> 
            {
                if (e.getStateChange() == ItemEvent.SELECTED) 
                {
                    statusbar.setText("Medium");
                }
            });

        JRadioButtonMenuItem haRMi = new JRadioButtonMenuItem("Hard");
        difMenu.add(haRMi);

        haRMi.addItemListener((ItemEvent e) -> 
            {
                if (e.getStateChange() == ItemEvent.SELECTED) 
                {
                    statusbar.setText("Hard");
                }
            });

        difGroup.add(eaRMi);
        difGroup.add(meRMi);
        difGroup.add(haRMi);

        jmb.add(f);jmb.add(v);jmb.add(t);jmb.add(ey);

        jmb.add(Box.createHorizontalGlue());jmb.add(h);

        jmb.add(difMenu);

        setJMenuBar(jmb);
    }

    private void cPM() 
    {
        pm = new JPopupMenu();

        JMenuItem mi  = new JMenuItem("Minimize");
        mi.setToolTipText("To Minimize");
        int c=1;
        mi.addActionListener((ActionEvent e) -> 
            {
                if (getExtendedState() != 
                JFrame.ICONIFIED) 
                {
                    setExtendedState(ICONIFIED);
                }
            });
        pm.add(mi);
        JMenuItem  re=new JMenuItem("Restore");
        re.setToolTipText("To Restore");

        re.addActionListener((ActionEvent e) -> 
            {
                if (getExtendedState() != 
                JFrame.NORMAL) 
                {
                    setExtendedState(NORMAL);
                }
            });
        pm.add(re);

        JMenuItem maxMi = new JMenuItem("Maximize");
        maxMi.setToolTipText("To Maximize");

        maxMi.addActionListener((ActionEvent e) -> 
            {
                if (getExtendedState() != JFrame.MAXIMIZED_BOTH) 
                {
                    setExtendedState(JFrame.MAXIMIZED_BOTH);
                }
            });

        pm.add(maxMi);

        JMenuItem quitMi = new JMenuItem("Quit");
        quitMi.setToolTipText("To Quit");

        quitMi.addActionListener((ActionEvent e) -> 
            {
                System.exit(0);
            });

        pm.add(quitMi);

        addMouseListener(new MouseAdapter() 
            {
                public void mouseReleased(MouseEvent e) {

                    if (e.getButton() == MouseEvent.BUTTON3) 
                    {
                        pm.show(e.getComponent(), e.getX(), e.getY());
                    }
                }
            });
    }

    private void createLayout(JComponent... arg) 
    {

        Container pane = getContentPane();
        GroupLayout g1 = new GroupLayout(pane);
        pane.setLayout(g1);

        g1.setAutoCreateContainerGaps(true);
        g1.setAutoCreateGaps(true);

        g1.setHorizontalGroup(g1.createSequentialGroup()
            .addComponent(arg[0])
            .addComponent(arg[1])
            .addComponent(arg[2])
            .addComponent(arg[3])
            .addComponent(arg[4])
            .addComponent(arg[5])
            .addComponent(arg[6])
        );

        g1.setVerticalGroup(g1.createParallelGroup()
            .addComponent(arg[0])
            .addComponent(arg[1])
            .addComponent(arg[2])
            .addComponent(arg[3])
            .addComponent(arg[4])
            .addComponent(arg[5])
            .addComponent(arg[6])
        );
        for(int x=0;x<=6;g1.linkSize(arg[x]),x++);

        pack();
    }

    public static void main(String args [])
    {
        EventQueue.invokeLater(()->
            {
                Graphic_9 ex = new Graphic_9();
                ex.setVisible(true); 
            });
    }
}