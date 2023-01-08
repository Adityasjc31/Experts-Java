package Gui;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
class Copying_JList extends JFrame implements ActionListener
{
    String color[]={"BLUE","RED","GREEN","YELLOW","GREY","ORANGE","CYAN"};
    JList l1=new JList<String>(color);
    JList l2=new JList();
    JButton b = new JButton("COPY>>>>>>>");
    public Copying_JList()
    {
        setLayout(new FlowLayout());
        add(new JScrollPane(l1));
        add(b);
        add(l2);
        b.addActionListener(this);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        pack();
    }

    public void actionPerformed(ActionEvent evt)
    {
        l2.setListData(l1.getSelectedValues());
        pack();
    }

    public static void main(String args [])
    {
        new Copying_JList().setVisible(true);
    }
}