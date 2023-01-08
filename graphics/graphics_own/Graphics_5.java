package graphics.graphics_own;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Graphics_5 extends JFrame
{
    public Graphics_5()
    {
        gui();
    }

    private  void gui()
    {
        JButton jb = new JButton("Button");
        jb.addActionListener((ActionEvent e)->
        {
            System.out.println("Button Pressed");
        }
        );
        createLayout(jb);
        setTitle("Aditya Srivatava Jframe");
        setSize(350,250);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private void createLayout(JComponent...arg)
    {
        Container  pa=getContentPane();
        GroupLayout g1 = new GroupLayout(pa);
        pa.setLayout(g1);

        g1.setAutoCreateContainerGaps(true);

        g1.setHorizontalGroup(g1.createSequentialGroup()
            .addComponent(arg[0]).addGap(200));
        g1.setVerticalGroup(g1.createSequentialGroup()
            .addComponent(arg[0])
            .addGap(120));

        pack();
    }

    public static void main()
    {
        EventQueue.invokeLater(()->
        {
            Graphics_5 ex = new Graphics_5();
        ex.setVisible(true);
    });
}
}