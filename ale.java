import java.awt.*;
import java.awt.event.*;
class ale extends WindowAdapter implements ActionListener
{
    static Frame f = new Frame("MY ATM");
    public static void main(String args[])
    {
        TextField tf = new TextField();
        TextField tf1 = new TextField();
        TextField tf2 = new TextField();
        Label l = new Label("ENTER YOUR PIN");
        Label l1 = new Label();
        Label l2 = new Label();
        Label l3 = new Label();
        Label l4 = new Label();
        Label l5 = new Label();
        Label l7 = new Label();
        Label l8 = new Label();
        Label l6 = new Label();
        Label h = new Label("WELCOME");
        Button b = new Button("SUBMIT");
        Button b1 = new Button("SAVING ACCOUNT");
        Button b2 = new Button("CURRENT ACCOUNT");
        Button b3 = new Button("QUERY/HELP");
        Button b4 = new Button("CASH WITHDRAWL");
        Button b5 = new Button("CASH DEPOSIT");
        Button b6 = new Button("SUBMIT");
        Button b7 = new Button("SUBMIT");
        h.setBounds(600,20,200,50);
        l.setBounds(20,50,200,50);
        tf.setBounds(150,50,250,50);
        tf1.setBounds(300,300,250,50);
        b.setBounds(400,50,150,50);
        l1.setBounds(50,100,150,50);
        l2.setBounds(50,150,150,50);
        l3.setBounds(50,200,150,50);
        l4.setBounds(200,100,150,50);
        l5.setBounds(50,300,250,50);
        l6.setBounds(50,350,250,50);
        l7.setBounds(50,500,250,50);
        l8.setBounds(50,550,250,50);
        b1.setBounds(200,250,150,50);
        b2.setBounds(400,250,150,50);
        b3.setBounds(800,50,150,50);
        b4.setBounds(800,100,150,50);
        b5.setBounds(800,150,150,50);
        b6.setBounds(600,300,150,50);
        b7.setBounds(600,500,150,50);
        tf2.setBounds(300,500,250,50);
        b.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e)
                {
                    int p = Integer.parseInt(tf.getText());
                    int pin[] = {220,221};
                    for(int i = 0;i<pin.length;i++)
                    {
                        if(pin[i]==p)
                        {
                            if(p==220)
                            {
                                l1.setText("AARYA BANERJEE");
                                l2.setText("ACCOUNT NUMBER=1234");
                                l3.setText("BALANCE=200000");
                                break;
                            }
                        }
                        else if(p==221)
                        {
                            l1.setText("AAYRA BANERJEE");
                            l2.setText("ACCOUNT NUMBER=1294");
                            l3.setText("BALANCE=300000");
                            break;
                        }
                        else
                        {
                            l4.setText("INVALID PIN");
                            break;
                        }
                    }
                }
            });	
        b4.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e)
                {
                    l5.setText("ENTER MONEY FOR WITHDRAWL");
                }
            });
        b6.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e)
                {
                    int q = Integer.parseInt(tf1.getText());
                    l6.setText("YOUR TRANSACTION IS PROCESSING");
                }});
        b5.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e)
                {
                    l7.setText("ENTER MONEY FOR WITHDRAWL");
                }
            });
        b7.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e)
                {
                    int q = Integer.parseInt(tf1.getText());
                    l8.setText("YOUR MONEY IS BEING DEPOSITED");
                }});
        f.add(tf);
        f.add(tf1);
        f.add(tf2);
        f.add(l);
        f.add(h);
        f.add(b);
        f.add(l1);
        f.add(l2);
        f.add(l3);
        f.add(l4);
        f.add(l5);
        f.add(l6);
        f.add(l7);
        f.add(l8);
        f.add(b1);
        f.add(b2);
        f.add(l5);
        f.add(b3);
        f.add(b4);
        f.add(b5);
        f.add(b6);
        f.add(b7);
        f.setSize(1200,1200);
        f.setLayout(null);
        f.setVisible(true);

        f.addWindowListener(new WindowAdapter(){
                public void windowClosing(WindowEvent e)
                {
                    System.exit(0);
                }
            });
    } 

    public void actionPerformed(ActionEvent evt){}

    public void windowClosing(WindowEvent e)
    {
        System.exit(0);
    }
}