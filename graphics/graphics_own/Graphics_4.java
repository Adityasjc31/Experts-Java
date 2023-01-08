package graphics.graphics_own;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Graphics_4 extends JFrame
{
    public Graphics_4()
    {
        gui();
    }

    private  void gui()
    {
        JButton jb = new JButton("Button");

        createLayout(jb);
        setTitle("Aditya Srivatava Jframe");
        setSize(350,250);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private void createLayout(JComponent...arg)
    {
        JPanel pa = (JPanel) getContentPane();
        GroupLayout g1 = new GroupLayout(pa);
        pa.setLayout(g1);

        pa.setToolTipText("Content pane");

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
            Graphics_4 ex = new Graphics_4();
        ex.setVisible(true);
    });
}
}