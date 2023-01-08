package school;

import static javax.swing.GroupLayout.Alignment.BASELINE;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import java.util.*;
public class Mall_Marketing extends Array_Market implements ActionListener
{
    private JLabel versme;
    public static void main(String args[])
    {
        try
        {
            read();
            EventQueue.invokeLater(() -> 
                {
                    Mall_Marketing ex = new Mall_Marketing();
                    ex.setVisible(true);
                }
            );
        }
        catch(Exception e)
        {
        }
    }

    public Mall_Marketing()
    {   
        try
        {
            Shower();
        }
        catch(Exception e )
        {
        }
    }

    void createLayout(JComponent... arg)
    {
        Container pane = getContentPane();
        GroupLayout gl = new GroupLayout(pane);
        pane.setLayout(gl);

        gl.setAutoCreateContainerGaps(true);
        gl.setAutoCreateGaps(true);

        gl.setHorizontalGroup(gl.createSequentialGroup()
            .addComponent(arg[0])
            .addComponent(arg[1])
            .addComponent(arg[2])
            .addComponent(arg[3])
        );

        gl.setVerticalGroup(gl.createParallelGroup(BASELINE)
            .addComponent(arg[0])
            .addComponent(arg[1])
            .addComponent(arg[2])
            .addComponent(arg[3])
        );

        pack();
    }

    public void Shower()throws Exception
    {
        read();
        Scanner sc = new Scanner(System.in);
        String d1;byte b1=1;
        String op1[]={"",
                "Modify","Hello Customer","Status"};
        box=new JComboBox<>(op1);
        display = new JLabel(a);
        JButton ok = new JButton("Exit");
        box.addActionListener(this);

        box.addItemListener(this);
        ok.addActionListener(this);
        ok.setBackground(Color.red);
        box.setBackground(Color.white);
        versme=new JLabel("Version 1.02.02 Aditya Srivastava");
        Font f = new Font("Consolas",Font.BOLD,10);
        versme.setFont(f);
        createLayout(versme,box,display,ok);

        setTitle("||Welcome To Aditya Srivatava World||");
        setSize(650,100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        return;
    }

    public static void main()throws Exception
    {
        read();
        Scanner sc = new Scanner(System.in);
        String d1;byte b1=1;
        do
        {
            System.out.print("\f");
            Detail_Display.startline();
            System.out.print("If you want to see the status of your store type \"Show\"\nIf you want to take entry for customers type \"Hello Customer\"\nIf you want to modify anything in the store type \"modify\"\nElse type \"Quit\" to exit\nEnter your Choice : ");
            d1=sc.nextLine();
            if(d1.equalsIgnoreCase("Modify"))
            {
                Modify_Market.whichModify();
            }
            else if(d1.equalsIgnoreCase("Hello Customer"))
            {
                lm=false;
                Detail_Display.line();

                Customer_Detail.input();
                if(b)
                {
                    Detail_Display.Bill_Display();

                    Detail_Display.line();

                    double GST = bill - (bill*18)/100.0;
                    if(GST!=0)
                    {
                        System.out.println("GST is "+GST);

                        Detail_Display.line();

                        System.out.println("Total Bill = "+bill);
                        Detail_Display.line();

                        System.out.println("Press any Key to continue");
                        String m=sc.nextLine();
                        if(m.equalsIgnoreCase("quit"))
                        {
                            Detail_Display.AnyClose();
                        }
                    }
                    else
                    {
                        System.out.println("Unable to prepare the bill");
                        for(int z=0;z<=15;z++)Thread.sleep(550);
                    }
                }
                bill=0.0;
                d=0;
                for(int x=0;x<30;x++)
                {
                    print[x]=null;
                    printbill[x]=null;
                }
                lm=true;
            }
            else if(d1.equalsIgnoreCase("Show"))
            {
                System.out.print("\f");
                Status_See.Status();
            }
        }while(!d1.equalsIgnoreCase("Quit"));
        writer(true);
        Detail_Display.Close();
    }
}