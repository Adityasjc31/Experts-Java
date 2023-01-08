package Gui;

import java.io.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class PhoneBook extends JFrame implements ActionListener
{
    private JButton load = new JButton("Load");
    private JButton save = new JButton("Save");
    private JButton add = new JButton("Add");
    private JButton remove = new JButton("Remove");
    private JButton search = new JButton("Search");
    private JTextArea Aname = new JTextArea(20,20);
    private JTextArea Aphno = new JTextArea(20,20);
    private JTextField name = new JTextField(20);
    private JTextField ph_no = new JTextField(20);
    private JScrollPane jsp=new JScrollPane(Aname);
    private JScrollPane jsn=new JScrollPane(Aphno);
    private JPanel p = new JPanel();
    private JPanel b = new JPanel();
    private JPanel tf = new JPanel();
    public PhoneBook()
    {
        setLayout(new FlowLayout());

        fields();
        buttons();
        add.addActionListener(this);
        add(p);
        add(b);
        Aname.setEditable(false);
        Aphno.setEditable(false);

        setLocationRelativeTo(null);
        setVisible(true);
        pack();
    }
    private JLabel Name  = new JLabel("Names");
    private JLabel Phno = new JLabel("Phone Numbers");
    private void buttons()
    {
        JPanel pane = new JPanel();
        pane.setLayout(new BorderLayout(60,50));
        b.setLayout(new FlowLayout(FlowLayout.RIGHT));
        b.add(pane.add(Name));
        b.add(jsp);
        b.add(Phno);
        b.add(jsn);
        b.add(remove);
        remove.addActionListener(this);
        b.add(add);
        b.add(search);
    }

    private void fields()
    {
        p.add(load);
        p.add(save);

        p.setLayout(new FlowLayout(FlowLayout.LEFT));
        load.addActionListener(this);
        save.addActionListener(this);
        save.setVisible(false);
        p.add(add);
    }
    private JLabel ename = new JLabel("Name Of the Person");
    private JLabel ephno = new JLabel("Phone Number of the Person");
    private JButton ok = new JButton("OK");
    private void Fields_Visible()
    {
        tf.setLayout(new GridLayout(5,5));

        tf.add(ename);
        tf.add(name);
        tf.add(ephno);
        tf.add(ph_no);
        tf.add(ok);

        name.addActionListener(this);
        ph_no.addActionListener(this);
        ok.addActionListener(this);
        ph_no.addMouseMotionListener
        (
            new MouseMotionListener()
            {
                public void mouseMoved(MouseEvent e)
                {
                    ph_no.setForeground(Color.black);
                }

                public void mouseDragged(MouseEvent e)
                {
                }
            }

        );

        add(tf);
        tf.setVisible(true);
        pack();
    }

    private void read()
    {
        FileInputStream fin=null;
        DataInputStream din=null;
        try
        {
            fin = new FileInputStream("e:\\phones.bin");
            din = new DataInputStream(fin);
            String s="",s1="";
            while(true)
            {
                try
                {
                    s=s+din.readUTF()+"\n";
                    s1=s1+din.readLong()+"\n";
                }
                catch(Exception e)
                {
                    break;
                }

            }
            din.close();
            fin.close();
            Aname.setText(s);
            Aphno.setText(s1);
        }
        catch(Exception e)
        {
        }
        finally
        {
            try
            {
                din.close();
                fin.close();
            }
            catch(Exception e)
            {
            }
        }

    }

    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==ok || ((ph_no.getText()!=null && name.getText()!=null) && (e.getSource()==ph_no || e.getSource()==name)))
        {
            ph_no.setForeground(Color.black);
            try
            {
                FileOutputStream fout = new FileOutputStream("e:\\phones.bin",true);
                DataOutputStream dout = new DataOutputStream(fout);
                try
                {
                    dout.writeUTF(name.getText());
                    dout.writeLong(Long.valueOf(ph_no.getText()));
                }
                catch(NumberFormatException e4)
                {
                    ph_no.setForeground(Color.red);
                }
                catch(Exception e1)
                {

                }

                dout.close();
                fout.close();
                read();
                add.setEnabled(true);
                tf.setVisible(false);
                pack();
            }
            catch(Exception e2)
            {
            }
        }
        else if(remove==e.getSource())
        {
            add.setEnabled(false);
            add.setBackground(Color.yellow);
            Aname.setEditable(true);
            Aphno.setEditable(true);
            save.setVisible(true);
            pack();
        }
        else if(load==e.getSource())
        {
            read();
        }
        else if(save==e.getSource())
        {
            save.setVisible(false);
            add.setEnabled(true);
            Aname.setEditable(false);
            Aphno.setEditable(false);

            add.setBackground(new JButton().getBackground());
            pack();
        }
        if(e.getSource()==add)
        {
            Fields_Visible();
            add.setEnabled(false);
        }
    }
}