package Gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class Bolding_text extends JFrame implements ItemListener
{
    private JTextField t=new JTextField(15);
    private JRadioButton r1=new JRadioButton("Plain");
    private JRadioButton r2=new JRadioButton("Bold");
    public Bolding_text()
    {
        setLayout(new FlowLayout());
        add(t);
        add(r1);
        add(r2);
        r1.setSelected(true);
        Font f = new Font("Consolas",Font.PLAIN,24);
        t.setFont(f);
        ButtonGroup bg = new ButtonGroup();
        bg.add(r1);
        bg.add(r2);
        r1.addItemListener(this);
        r2.addItemListener(this);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setLocationRelativeTo(null);
        pack();
    }

    public void itemStateChanged(ItemEvent a)
    {
        if(a.getSource() == r1)
        {
            Font f = new Font("Consolas",Font.PLAIN,24);
            t.setFont(f);
        }
        else if(a.getSource() == r2)
        {
            Font f = new Font("Consolas",Font.BOLD,24);
            t.setFont(f);
        }
    }
}