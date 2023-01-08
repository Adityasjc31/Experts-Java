package school;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.Arrays;

import static javax.swing.LayoutStyle.ComponentPlacement.UNRELATED;

class CustomerDetail extends Reaiter
{
    private JTextField name,phno,add,crID;
    private JPasswordField Pin;

    public CustomerDetail()
    {
        initUI();
    }

    private void initUI() 
    {
        JLabel lbl1 = new JLabel("Customer Name");
        JLabel lbl2 = new JLabel("Customer Phone Number");
        JLabel lbl3 = new JLabel("Customer Address");
        JLabel lbl4 = new JLabel("Customer Credit Card Name");
        JLabel lbl5 = new JLabel("Credit Pin");

        name = new JTextField(15);
        phno = new JTextField(15);
        add = new JTextField(15);
        crID = new JTextField(15);
        Pin = new JPasswordField(15);
        JButton submitButton = new JButton("Submit");

        submitButton.addActionListener(new SubmitAction());

        createLayout(lbl1,name,lbl2,phno,lbl3,add,lbl4,crID,lbl5, Pin, submitButton);

        setTitle("Details of the Customer");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    private class SubmitAction extends AbstractAction 
    {
        public void actionPerformed(ActionEvent e) 
        {
            doSubmitAction();
        }

        private void doSubmitAction() 
        {
            Reaiter.na = name.getText();
            Reaiter.phno = phno.getText();
            Reaiter.add = add.getText();
            Reaiter.cid = crID.getText();

            char[] passwd = Pin.getPassword();
            Reaiter.pass=new String(passwd);

            Arrays.fill(passwd, '0');
            dispose();
            Mall_Marketing.main(null);
            Entry e = new Entry();
            e.main(null);
        }
    }

    private void createLayout(Component... arg) 
    {
        Container pane = getContentPane();
        GroupLayout gl = new GroupLayout(pane);
        pane.setLayout(gl);

        gl.setAutoCreateGaps(true);
        gl.setAutoCreateContainerGaps(true);

        gl.setHorizontalGroup(gl.createSequentialGroup()
            .addGap(50)
            .addGroup(gl.createParallelGroup()
                .addComponent(arg[0])
                .addComponent(arg[1])
                .addComponent(arg[2])
                .addComponent(arg[3])
                .addComponent(arg[4])
                .addComponent(arg[5])
                .addComponent(arg[6])
                .addComponent(arg[7])
                .addComponent(arg[8])
                .addComponent(arg[9])
                .addComponent(arg[10])
            )
            .addGap(50)
        );

        gl.setVerticalGroup(gl.createSequentialGroup()
            .addGap(50)
            .addGroup(gl.createSequentialGroup()
                .addComponent(arg[0])
                .addComponent(arg[1], GroupLayout.DEFAULT_SIZE,
                    GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addComponent(arg[2])
                .addComponent(arg[3], GroupLayout.DEFAULT_SIZE,
                    GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addComponent(arg[4])
                .addComponent(arg[5], GroupLayout.DEFAULT_SIZE,
                    GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addComponent(arg[6])
                .addComponent(arg[7], GroupLayout.DEFAULT_SIZE,
                    GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addComponent(arg[8])
                .addComponent(arg[9], GroupLayout.DEFAULT_SIZE,
                    GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(UNRELATED)
                .addComponent(arg[10]))
            .addGap(50)
        );

        pack();
    }

    public static void main(String[] args) 
    {
        EventQueue.invokeLater(() -> 
            {
                CustomerDetail ex = new CustomerDetail();
                ex.setVisible(true);
            }
        );
    }
}