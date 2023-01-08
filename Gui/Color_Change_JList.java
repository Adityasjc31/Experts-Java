package Gui;

import javax.swing.event.*;
import java.awt.*;
import javax.swing.*;
class Color_Change_JList extends JFrame implements ListSelectionListener
{
    String color[]={"BLUE","RED","GREEN","YELLOW","GREY","ORANGE","CYAN"};
    Color color_implementer[]={Color.BLUE,Color.RED,Color.GREEN,Color.YELLOW,Color.GRAY,Color.ORANGE,Color.CYAN};
    JList l=new JList<String>(color);
    public Color_Change_JList()
    {
        setLayout(new FlowLayout());
        add(l);
        l.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        l.addListSelectionListener(this);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        pack();
    }

    public void valueChanged(ListSelectionEvent evt)
    {
        getContentPane().setBackground(color_implementer[l.getSelectedIndex()]);
    }

    public static void main(String args [])
    {
        new Color_Change_JList().setVisible(true);
    }
}