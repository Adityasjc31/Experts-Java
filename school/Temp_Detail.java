package school;

import static javax.swing.GroupLayout.Alignment.BASELINE;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import java.util.*;
import static javax.swing.GroupLayout.Alignment.CENTER;
class Temp_Detail extends Reaiter
{
    public Temp_Detail()
    {
        GUI();
    }
    private JList list;
    void GUI()
    {
        assign();

        JScrollPane scrollPane = new JScrollPane(list);
        createLayout(scrollPane);

        setTitle("Quantity which have been bought");
        setSize(600,250);
        setResizable(false);
        Point a = new Point();
        a.x=100;
        a.y=600;
        setLocation(a);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    public void assign()
    {
        model1 = new DefaultListModel();

        statechanged();

        list = new JList(model1);
        list.setBackground(Color.white);
        list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    }

    public void statechanged()
    {
        int l=0;
        String t="        ";        
        try
        {
            Reaiter.temp_read();
            l=ing.length;
            model1.clear();
            for(int in = 0;in<l;in++)
            {
                model1.addElement(
                    in+1+t
                    +ing[in]
                    +tabadder(3-reqtab(ing[in]),ing[in])
                    +ipg[in]+t+t+t+t
                    +icg[in]
                    +tabadder(2-reqtab(icg[in]),icg[in])
                    +iqg[in]
                    +tabadder(2-reqtab(iqg[in]+""),iqg[in])
                );
            }
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage()+"\n"+l);
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

    public static void main() 
    {
        Temp_Detail td = new Temp_Detail();
        td.setVisible(true);
    }
}