package school;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class Product_Detail extends Reaiter
{
    int w;
    public Product_Detail(int x)
    {
        this.w=x;
        gui();
    }

    public Product_Detail()
    {
        gui();
    }
    private JTextPane pane;
    public void statechanged()
    {
        String text =
            "Product Name : "+Reaiter.item[w]+"\n"+
            "Product Code :"+Reaiter.item_code[w]+"\n"+
            "Product Price : "+Reaiter.item_price[w]+"\n"+
            "Number of Products : "+Reaiter.item_quantity[w]
        ;

        pane.setText(text);
    }

    public void gui()
    {
        JPanel startup = new JPanel();
        startup.setLayout(new BoxLayout(startup, BoxLayout.Y_AXIS));
        add(startup);
        JPanel textPanel = new JPanel(new BorderLayout());
        textPanel.setBorder(BorderFactory.createEmptyBorder(15, 25, 15, 25));
        pane = new JTextPane();
        pane.setContentType("text");
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

        setTitle("Details of the Product");
        setSize(new Dimension(500, 200));
        setResizable(false);
        setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        Point p = new Point();
        p.x=60;
        p.y=50;
        setLocation(p);
    }

    public static void main()
    {
        SwingUtilities.invokeLater(new Runnable() 
            {
                public void run()
                {
                    Product_Detail sd = new Product_Detail();
                    sd.setVisible(true);
                }
            });
    }
}