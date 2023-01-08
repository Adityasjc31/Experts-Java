package school;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.Arrays;

import static javax.swing.LayoutStyle.ComponentPlacement.UNRELATED;
import static javax.swing.GroupLayout.Alignment.BASELINE;
public class Password extends Reaiter
{
    private JTextField UID;
    private JPasswordField Pass;
    static boolean closed = true;
    public Password()
    {
        Reaiter.UserID_Pass();
        initUI();
    }

    private void initUI() 
    {
        JLabel lbl1 = new JLabel("User ID");
        JLabel lbl2 = new JLabel("Password");

        UID = new JTextField(15);
        Pass = new JPasswordField(15);
        JButton submitButton = new JButton("Submit");
        JButton close = new JButton("Close");
        close.addActionListener((ActionEvent e) ->
            {
                EventQueue.invokeLater(()->
                    {
                        setVisible(false);
                        dispose();
                        super.a="Your Choice";
                        Mall_Marketing.main(null);
                    });
            });
        submitButton.addActionListener(new SubmitAction());
       
        createLayout(lbl1,UID , lbl2, Pass, submitButton,close);
        setSize(300,210);
        setResizable(false);
        setTitle("Identification Required");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
    }

    private class SubmitAction extends AbstractAction 
    {
        public void actionPerformed(ActionEvent e) 
        {
            doSubmitAction();
        }

        private int Search(String ar[],String s)
        {
            int in=-1;
            for(int x=0;x<ar.length;x++)
            {
                if(ar[x].equalsIgnoreCase(s))
                {
                    in=x;
                    break;
                }
            }
            return in;
        }

        private void doSubmitAction() 
        {
            String login = UID.getText();
            int l=Search(Reaiter.UserId,login);
            char[] passwd = Pass.getPassword();
            String s=new String(passwd);
            int z=Search(Reaiter.password,s);
            int p=-1;
            if(z!=-1)
            {
                if(Reaiter.password[z].equals(s))
                {
                    p=1;
                }
            }

            if(l!=-1 && p!=-1)
            {
                dispose();
                Modify_Market.main(null);
            }
            else
            {
                if(l==-1)
                {
                    JOptionPane.showMessageDialog(null,"Wrong UserID and Password", "Alert!", JOptionPane.WARNING_MESSAGE);
                }   
                else if(p==-1)
                {
                    JOptionPane.showMessageDialog(null,"Wrong Password", "Alert!", JOptionPane.WARNING_MESSAGE);
                }
            }
            Arrays.fill(passwd, '0');
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
            .addGap(10)
            .addGroup(gl.createParallelGroup()
                .addComponent(arg[0])
                .addComponent(arg[1])
                .addComponent(arg[2])
                .addComponent(arg[3])
                .addComponent(arg[4])
                .addComponent(arg[5])
            )
        );

        gl.setVerticalGroup(gl.createSequentialGroup()
            .addGap(10)
            .addGroup(gl.createSequentialGroup()
                .addComponent(arg[0])
                .addComponent(arg[1], GroupLayout.DEFAULT_SIZE,
                    GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addComponent(arg[2])
                .addComponent(arg[3], GroupLayout.DEFAULT_SIZE,
                    GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(UNRELATED)
                .addComponent(arg[4])
                .addPreferredGap(UNRELATED)
                .addComponent(arg[5])
            )
        );

        pack();
    }

    public static void main(String[] args) 
    {
        EventQueue.invokeLater(() -> 
            {
                Password ex = new Password();
                ex.setVisible(true);
            }
        );
    }
}