package Gui.trying;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class ToolBar extends JPanel
{
    private JButton home;
    private SignInEvent sie;
    public ToolBar()
    {
        Dimension d = getPreferredSize();
        d.height=50;
        setPreferredSize(d);
        init();
    }

    private void init()
    {
        setLayout(new FlowLayout(FlowLayout.LEFT));
        home = new JButton("Home");

        home.addActionListener((ActionEvent evt)->
            {
                SignInScreen sis = new SignInScreen(this,this);
                if(sie!=null)
                {
                   this.sie.signInScreen(sis);
                }
            }
        );

        add(home);
    }
    
    public void addSignInScreenlistener(SignInEvent sis)
    {
        sie=sis;
    }
}