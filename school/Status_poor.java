package school;

import static javax.swing.GroupLayout.Alignment.BASELINE;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import java.util.*;
import static javax.swing.GroupLayout.Alignment.CENTER;
class Status_poor extends JFrame
{
    public Status_poor()
    {
        Status_poor();
    }
    int a=0;
    void arange()
    {
        fillup();
        for(int x=0;x<item.length;x++)
        {
            for(int y=0;y<item.length-1;y++)
            {
                if(item[y].length()>item[y+1].length())
                {
                    String t=item[y];
                    item[y]=item[y+1];
                    item[y+1]=t;

                    double t1=price[y];
                    price[y]=price[y+1];
                    price[y+1]=t1;
                }
            }
        }
    }
    String []item = new String[30];
    String code[] = new String[30];
    double price[]=new double[30];
    int quantity[]=new int[30];
    void fillup()
    {
        try{Reaiter.read();}catch(Exception e){}
        for(int x=0;x<30;x++)
        {
            item[x]=Reaiter.item[x];
            code[x]=Reaiter.item_code[x];
            price[x]=Reaiter.item_price[x];
            quantity[x]=Reaiter.item_quantity[x];
        }
    }

    private void createLayout(JComponent... arg)
    {
        Container pane = getContentPane();
        GroupLayout gl = new GroupLayout(pane);
        pane.setLayout(gl);

        gl.setAutoCreateContainerGaps(true);
        gl.setAutoCreateGaps(true);

        gl.setHorizontalGroup(gl.createSequentialGroup()
            .addComponent(arg[0])
        );

        gl.setVerticalGroup(gl.createParallelGroup(CENTER)
            .addComponent(arg[0])
        );

        pack();
    }
    private DefaultListModel model;
    private JList list;
    String s="        ",s1="--------";
    void Status_poor()
    {
        fillup();
        cl();
        //         arange();
        JScrollPane scrollPane = new JScrollPane(list);
        createLayout(scrollPane);
        setTitle("|Status_poor|");

        setSize(600,250);
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    public static String tabadder(int n,String s)
    {
        String t="";
        int l=s.length();
        for(int x=1;x<=8-l;x++)
        {
            t=t+" ";
        }

        for(int x=0;x<n;x++)
        {
            t=t+"        ";
        }
        return t;
    }

    public static int reqtab(String s)
    {
        return s.length()>=16 ? (s.length()/8) - 1 :0;
    }

    public void cl()
    {
        model = new DefaultListModel();
        String t="        ";
        model.addElement("Sl.No"+t+"Item Name"+t+t+t+"Product Price"+t+t+t+"Product Code"+t+t+"Number of quantities");
        for(int in=0;in<item.length;in++)
            model.addElement(
                (in+1)+t+t+t
                +item[in]+tabadder(3-reqtab(item[in]),item[in])
                    +price[in]+t+t+t+t+t
                    +code[in]+tabadder(2-reqtab(code[in]),code[in])+t+t
                    +quantity[in]+tabadder(2-reqtab(quantity[in]+""),quantity[in]+""));
        list = new JList(model);
 
        list.setBackground(Color.white);
        list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    }

    public static void main(String[] args) 
    {
        EventQueue.invokeLater(
            () ->
            {
                Status_poor ex = new Status_poor();
                ex.setVisible(true);
            }
        );
    }
}