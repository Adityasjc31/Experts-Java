
package school;

import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
class Show_Detail extends Reaiter
{
    public Show_Detail()
    {
        screen();
    }
    private JPanel startup;
    private JPanel topPanel;
    private JLabel company;
    private JPanel textPanel;
    private JTextPane pane;
    private JPanel bottom;
    private String text;
    private JButton stb;
    private void screen()
    {
        startup = new JPanel();
        startup.setLayout(new BoxLayout(startup, BoxLayout.Y_AXIS));
        add(startup);

        topPanel = new JPanel(new BorderLayout(0, 0));
        topPanel.setMaximumSize(new Dimension(450, 0));
        company = new JLabel("Zeus Companies");
        company.setBorder(BorderFactory.createEmptyBorder(0, 25, 0, 0));

        topPanel.add(company);

        startup.add(topPanel);

        textPanel = new JPanel(new BorderLayout());
        textPanel.setBorder(BorderFactory.createEmptyBorder(15, 25, 15, 25));
        pane = new JTextPane();
        pane.setContentType("text");
        text =
        "Customer Name : "+Reaiter.na+"\n"+
        "Customer Phone Number :"+Reaiter.phno+"\n"+
        "Customer address : "+Reaiter.add+"\n"+
        "User Id of Customer Card : "+Reaiter.cid
        ;

        pane.setText(text);
        pane.setFont(new Font("",Font.BOLD,12));
        pane.setForeground(Color.black);
        pane.setEditable(false);
        textPanel.add(pane);

        startup.add(textPanel);
        bottom = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        stb= new JButton("See the Bill");
        stb.addActionListener(new Bill());
        stb.setMnemonic(KeyEvent.VK_N);
        JButton close = new JButton("Close");
        close.addActionListener((ActionEvent e)->
                EventQueue.invokeLater(()->
                    {
                        quantity_temp_writer(false);

                        setVisible(false);
                    }
                )
        ); 
        close.setMnemonic(KeyEvent.VK_C);

        bottom.add(stb);
        bottom.add(close);
        startup.add(bottom);

        bottom.setMaximumSize(new Dimension(450, 0));

        setTitle("Details of the Customer");
        setSize(new Dimension(500, 250));
        setResizable(false);
        setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        Point p = new Point();
        p.x=550;
        p.y=50;
        setLocation(p);
    }
    private class Bill extends AbstractAction
    {
        public void actionPerformed(ActionEvent evt)
        {
            try{writer(true);}catch(Exception e){}
            pane.setForeground(Color.blue);
            // stb.setVisible(false);
            calculate();
            setSize(new Dimension(1000, 250));
            text+="\nSl.No\tItem Name\t\t\tProduct Price\t\t\tProduct Code\t\tNumber of quantities";
            for(int in=0;in<ing.length;in++)
                text+="\n"+(in+1)+"\t"+ing[in]+tabadder(3-reqtab(ing[in]),ing[in])+ipg[in]+"\t\t\t\t"+icg[in]+tabadder(2-reqtab(icg[in]),icg[in])+"\t"+iqg[in]+tabadder(2-reqtab(iqg[in]+""),iqg[in]+"");
            text+="\nBill : "+bill;
            pane.setText(text);
            pack();
        }
        private void calculate()
        {
            for(int x=0;x<iqg.length;x++)
            {
                bill=bill+(Integer.valueOf(iqg[x])*Double.valueOf(ipg[x]));
            }
            bill = bill+((18/100.0)*bill);
        }
    }
    public static void main()
    {
        SwingUtilities.invokeLater(new Runnable() 
            {
                public void run()
                {
                    Show_Detail sd = new Show_Detail();
                    sd.setVisible(true);
                }
            });
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
}