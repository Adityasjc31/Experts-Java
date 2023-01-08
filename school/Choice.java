package school;

import static javax.swing.GroupLayout.Alignment.BASELINE;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
class Choice extends Reaiter implements ActionListener
{
    public void statechanged()
    {
        rtq.setEnabled(true);
        ntg.setEnabled(true);
        give.setEnabled(true);
    }
    static Product_Detail pd;
    static Choice ch;
    public static void render(Product_Detail p)
    {
        pd=p;
    }

    public void actionPerformed(ActionEvent e)
    {
        String s=e.getActionCommand();
        if(s.equals("Renter the quanity"))
        {
            this.dispose();
            rtq.setSelected(false);
            rtq.setEnabled(false);
            Quanput q = new Quanput();
            Quanput.qq=q;
            q.refer(pd);
            q.setVisible(true);
        }
        if(s.equals("Not to give"))
        {
            ntg.setSelected(false);
            rtq.setEnabled(false);
            this.dispose();
        }
        if(s.equals("What is left that should be given"))
        {
            give.setSelected(false);
            give.setEnabled(false);
            this.dispose();
            Reaiter.qut=item_quantity[pd.w];
            item_quantity[pd.w]=0;
            pd.statechanged();
            super.wq=pd.w;

            quantity_temp_writer(true);

            td.dispose();

            Temp_Detail td1 = new Temp_Detail();
            td1.statechanged();
            td1.setVisible(true);
        }

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
    }

    public Choice()
    {
        modifier();
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
            .addComponent(arg[1])
            .addComponent(arg[2])
        );

        gl.setVerticalGroup(gl.createParallelGroup(BASELINE)
            .addComponent(arg[0])
            .addComponent(arg[1])
            .addComponent(arg[2])

        );
        gl.linkSize(give,rtq,ntg);

        pack();
    }

    public static void main(String[] args) 
    {
        EventQueue.invokeLater(() ->
            {
                Choice ex = new Choice();
                ex.setVisible(true);
            }
        );
    }
    static JRadioButton rtq,ntg,give;
    public void modifier()
    {
        rtq = new JRadioButton("Renter the quanity", false);
        rtq.addActionListener(this);

        ntg = new JRadioButton("Not to give", false);
        ntg.addActionListener(this);

        give = new JRadioButton("What is left that should be given", false);
        give.addActionListener(this);

        setResizable(false);

        createLayout(give,rtq,ntg);
        setTitle("Error In Configuration");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
}