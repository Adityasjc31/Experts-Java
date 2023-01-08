package Gui.trying;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class CentralProcessingUnit extends JFrame implements VerifierEvent,ReplacerEvent,SignInEvent
{
    private Credentials credentials;
    private Verification verify;
    private SignUp signup;
    private ToolBar tb;
    public CentralProcessingUnit()
    {
        init();
    }

    private void init()
    {
        setLayout(new BorderLayout());
        signup = new SignUp();

        credentials = new Credentials();
        credentials.addVerifier(this);
        credentials.addReplacer(this);

        tb= new ToolBar();
        tb.addSignInScreenlistener(this);
        signup.addSignInScreenlistener(this);
        
        add(credentials,BorderLayout.CENTER);
        add(tb,BorderLayout.NORTH);
        setLocationRelativeTo(null);
        pack();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void signInScreen(SignInScreen evt)
    {
        signup.setvisible(false);
        credentials.setVisible(true);
        if(getExtendedState() != JFrame.MAXIMIZED_BOTH)
            add(credentials,BorderLayout.CENTER);
    }

    public void verifierEvent(VerificationEvent evt)
    {
        String[] cred=evt.getUserCredentials();
        JLabel[] labels=evt.getLabels();
        verify = new Verification(cred,labels);
        if(getExtendedState() != JFrame.MAXIMIZED_BOTH)
            pack();
    }

    public void replacerEvent(ReplacerHolder rh)
    {
        Credentials cred = rh.getReplacer();
        cred.setVisible(false);
        if(signup.isEnabled())
        {
            signup.setVisible(true);
        }
        add(signup,BorderLayout.CENTER);
        if(getExtendedState() != JFrame.MAXIMIZED_BOTH)
            pack();
    }
}