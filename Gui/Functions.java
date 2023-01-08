package Gui;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import static javax.swing.LayoutStyle.ComponentPlacement.RELATED;
class Functions extends JFrame
{
    public Functions()
    {
        init();
        setVisible(true);
    }

    public void init()
    {
        JButton exit=new JButton("EXIT");
        createLayout(exit);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    public void createLayout(JComponent...arg)
    {
        Container pane=getContentPane();
        GroupLayout gl=new GroupLayout(pane);
        pane.setLayout(gl);

        gl.setAutoCreateContainerGaps(true);
        gl.setAutoCreateGaps(true);

        gl.setHorizontalGroup(
            gl.createSequentialGroup()
            .addComponent(arg[0])
        );
        
        gl.setVerticalGroup(gl.createSequentialGroup()
            .addPreferredGap(RELATED,
                GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(gl.createParallelGroup()
                .addComponent(arg[0])
        ));

        pack();
    }
}