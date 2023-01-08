package school;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class Quanput extends Reaiter implements ActionListener
{
    private JTextField qu;
    private JButton ok,close;
    public Quanput()
    {
        setTitle("Quantity Input");
        gui();
    }
    Product_Detail pd;
    public void refer(Product_Detail pd)
    {
        this.pd=pd;
    }

    public void gui()
    {
        c.statechanged();
        setLayout(new FlowLayout());
        qu=new JTextField(20);
        ok=new JButton("OK");
        ok.addActionListener(this);
        qu.addActionListener(this);
        close=new JButton("Close");
        close.addActionListener((ActionEvent e)->
                EventQueue.invokeLater(()->
                    {
                        this.dispose();
                    }
                )
        );setLocationRelativeTo(null);
        add(qu);add(ok);add(close);

        setResizable(false);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        pack();
    }

    public void normalstate()
    {
        qu.setEditable(true);
        ok.setVisible(true);
        close.setVisible(false);
    }
    static int quan=0;
    static Quanput qq;
    static Choice c = new Choice();
    static boolean b=true;
    public void actionPerformed(ActionEvent a)
    {
        Choice ch=c;
        try
        {
            quan=Integer.valueOf(qu.getText());
            
            if(quan<=0 )
            {
                JOptionPane.showMessageDialog(this,"Renter the quantity","Quantity entered is wrong",JOptionPane.WARNING_MESSAGE);
            }
            else if(Reaiter.item_quantity[pd.w]-quan<0)
            {
                c.dispose();
                this.dispose();
                Choice.render(pd);
                quan=0;
                c.setVisible(true);
            }
            else
            {
                if(t.equalsIgnoreCase("Via Product Code"))
                {
                    Items_Code_taken.remAllBtn.setVisible(true);
                    Items_Code_taken.addBtn.setVisible(true);
                    Items_Code_taken.delBtn.setVisible(true);
                    Items_Code_taken.renBtn.setVisible(true);
                }
                else if(t.equalsIgnoreCase("Via Product Name"))
                {
                    Items_Name_taken.remAllBtn.setVisible(true);
                    Items_Name_taken.addBtn.setVisible(true);
                    Items_Name_taken.delBtn.setVisible(true);
                    Items_Name_taken.renBtn.setVisible(true);
                }
                c.dispose();
                Reaiter.item_quantity[pd.w]-=quan;
                entered=true;
                pd.statechanged();
                super.qut=quan;
                super.wq=pd.w;

                quantity_temp_writer(true);
                td.dispose();

                Temp_Detail td1 = new Temp_Detail();
                td1.setVisible(true); 
                Reaiter.td=td1;
                qu.setEditable(false);
                ok.setVisible(false);

                close.setVisible(true);
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this,e.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
        }
    }
}