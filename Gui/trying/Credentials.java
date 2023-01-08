package Gui.trying;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.Border;
class Credentials extends JPanel implements ActionListener
{
    private String username,password;
    private JTextField un;
    private JPasswordField pass;
    private JButton signIn,signUp;
    private JLabel user_name,pass_word;
    private VerifierEvent ve;
    private ReplacerEvent re;
    public Credentials()
    {
        init();
    }

    private void init()
    {
        setLayout(new GridBagLayout());

        user_name=new JLabel("Username : ");
        un=new JTextField(8);

        pass_word=new JLabel("Password : ");
        pass=new JPasswordField(8);

        signIn = new JButton("Sign in");
        signUp = new JButton("Sign Up");
        Border br1 = BorderFactory.createTitledBorder("Credentials Required");
        Border br2 = BorderFactory.createEmptyBorder(5,5,5,5);
        setBorder(BorderFactory.createCompoundBorder(br1,br2));
        Layout();
        un.addFocusListener((new FocusListener()
                {
                    public void focusLost(FocusEvent evt)
                    {
                    }

                    public void focusGained(FocusEvent evt)
                    {
                        user_name.setText("Username : ");
                        user_name.setForeground(Color.BLACK);
                    }
                }
            ));

        pass.addFocusListener((new FocusListener()
                {
                    public void focusLost(FocusEvent evt)
                    {
                    }

                    public void focusGained(FocusEvent evt)
                    {
                        user_name.setText("Username : ");
                        user_name.setForeground(Color.BLACK);

                        pass_word.setText("Password : ");
                        pass_word.setForeground(Color.BLACK);
                    }
                }
            ));
        un.addActionListener(this);
        pass.addActionListener(this);
        signIn.addActionListener(this);

        signUp.addActionListener((ActionEvent evt)->
            {
                ReplacerHolder rh = new ReplacerHolder(this,this);
                if(re!=null)
                {
                    this.re.replacerEvent(rh);
                }
            }
        );
    }

    public void actionPerformed(ActionEvent evt)
    {
        username=un.getText().trim();
        password=String.valueOf(pass.getPassword());
        VerificationEvent ve = new VerificationEvent(this,username,password,user_name,pass_word);
        if(ve!=null)
        {
            this.ve.verifierEvent(ve);
        }
    }

    private void Layout()
    {
        GridBagConstraints gbc = new GridBagConstraints();

        gbc.gridx=0;
        gbc.gridy=0;
        gbc.weightx=0;
        gbc.weighty=0;
        gbc.fill=GridBagConstraints.NONE;
        gbc.anchor=GridBagConstraints.LINE_END;
        gbc.insets=new Insets(0,0,0,5);
        add(user_name,gbc);

        gbc.gridx=1;
        gbc.gridy=0;
        gbc.anchor=GridBagConstraints.LINE_START;
        add(un,gbc);

        gbc.gridx=0;
        gbc.gridy=1;
        gbc.weightx=1;
        gbc.weighty=0.01;
        gbc.anchor=GridBagConstraints.FIRST_LINE_END;
        gbc.insets=new Insets(0,0,0,5);
        add(pass_word,gbc);

        gbc.gridx=1;
        gbc.gridy=1;
        gbc.anchor=GridBagConstraints.FIRST_LINE_START;
        add(pass,gbc);

        gbc.gridx=1;
        gbc.gridy=2;
        gbc.weightx=0;
        gbc.weighty=1;
        gbc.anchor=GridBagConstraints.FIRST_LINE_START;
        add(signIn,gbc);

        gbc.gridx=1;
        gbc.gridy=3;
        gbc.weightx=0;
        gbc.weighty=3;
        gbc.anchor=GridBagConstraints.FIRST_LINE_START;
        add(signUp,gbc);

    }

    public void addVerifier(VerifierEvent ev)
    {
        ve=ev;
    }

    public void addReplacer(ReplacerEvent er)
    {
        this.re=er;
    }
}