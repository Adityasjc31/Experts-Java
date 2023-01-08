package school;

import static javax.swing.GroupLayout.Alignment.BASELINE;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
class Entry extends Reaiter implements ItemListener
{
    private class SubmitAction extends AbstractAction 
    {
        public SubmitAction(String t)
        {
            Reaiter.t=t;
        }

        public void actionPerformed(ActionEvent e)
        {      
            dispose();
            if(t.equalsIgnoreCase("Via Product Name"))
            {
                Items_Name_taken.main();
            }
            else if(t.equalsIgnoreCase("Via Product Code"))
            {
                Items_Code_taken.main();
            }
            Show_Detail.main();
        }
    }

    public static void main(String args[])
    {
        EventQueue.invokeLater(() -> 
            {
                try
                {
                    Entry ex = new Entry();
                    ex.setVisible(true);
                }
                catch(Exception e)
                {
                }
            }
        );
    }

    public Entry()
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
        );

        gl.setVerticalGroup(gl.createParallelGroup(BASELINE)
            .addComponent(arg[0])
            .addComponent(arg[1])
            .addComponent(arg[2])
        );

        pack();
    }

    public void itemStateChanged(ItemEvent e) 
    {
        try
        {
            str1=String.valueOf(e.getItem()) ;
            if (e.getStateChange() == ItemEvent.SELECTED)
            {
                display.setText(e.getItem().toString());
                submit.addActionListener(new SubmitAction(display.getText()));
            }
        }
        catch(Exception e1)
        {
            System.out.println("Hello");
        }
    }
    private JComboBox<String> box1;
    private JLabel display; 
    private JButton submit;
    private void Shower()throws Exception
    {
        String d1;byte b1=1;
        String op1[]={"",
                "Via Product Code","Via Product Name"};
        box1=new JComboBox<>(op1);
        display = new JLabel(b);
        submit = new JButton("Submit");
        box1.addItemListener(this);
        createLayout(box1,display,submit);

        setTitle("Input");
        setSize(450,150);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        return;
    }
}