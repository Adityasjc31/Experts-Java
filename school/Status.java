package school;

import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
class Status extends Reaiter
{
    public Status()
    {
        screen();
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
            t=t+"\t";
        }
        return t;
    }

    public static int reqtab(String s)
    {
        return s.length()>=16 ? (s.length()/8) - 1 :0;
    }

    private void screen()
    {
        JPanel startup = new JPanel();
        startup.setLayout(new BoxLayout(startup, BoxLayout.Y_AXIS));
        add(startup);

        JSeparator separator = new JSeparator();
        separator.setForeground(Color.gray);
        
        JPanel textPanel = new JPanel(new BorderLayout());
        textPanel.setBorder(BorderFactory.createEmptyBorder(15, 25, 15, 25));
        
        JTextPane pane = new JTextPane();
        pane.setForeground(Color.red);
        pane.setBackground(Color.black);
        pane.setContentType("text");
        String text ="Sl.No\tItem Name\t\t\tProduct Price\t\t\tProduct Code\tNumber of quantities\n";
        for(int in=0;in<item.length;in++)
        {
            text +=in+1+"\t"+item[in]+tabadder(3-reqtab(item[in]),item[in])+item_price[in]+"\t\t\t\t"+item_code[in]+tabadder(2-reqtab(item_code[in]),item_code[in])+item_quantity[in]+"\t"+tabadder(2-reqtab(item_quantity[in]+""),item_quantity[in]+"")+"\n";
        }

        pane.setText(text);
        pane.setEditable(false);
        textPanel.add(pane);

        startup.add(textPanel);
        JPanel bottom = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        JButton close = new JButton("Close");
        close.addActionListener((ActionEvent e)->
                EventQueue.invokeLater(()->
                    {
                        setVisible(false);
                    }
                )
        ); 
        close.setMnemonic(KeyEvent.VK_C);

        bottom.add(close);
        startup.add(bottom);

        bottom.setMaximumSize(new Dimension(450, 0));

        setTitle("||Status||");
        setResizable(false);
        setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        Point p = new Point();
        p.x=400;
        p.y=100;
        setLocation(p);
        pack();
    }

    public static void main()
    {
        SwingUtilities.invokeLater(new Runnable() 
            {
                public void run()
                {
                    Status sd = new Status();
                    sd.setVisible(true);
                }
            });
    }
    static String newItem;static int index=-1;
    /*public void Correct()
    {
    if (!newItem.isEmpty() && index!=-1)
    {
    model.remove(index);
    model.add(index, newItem);
    }
    }
     */

    public Status(boolean f)
    {
    }
}