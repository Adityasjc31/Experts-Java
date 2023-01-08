package Gui.trying;

import java.util.EventObject;
import javax.swing.*;
class VerificationEvent extends EventObject
{
    private String username,password;
    private JLabel userL,passL;
    public VerificationEvent(Object source)
    {
        super(source);
    }
    
    public VerificationEvent(Object src,String un,String pass,JLabel user,JLabel passL)
    {
        super(src);
        username=un;
        password=pass;
        userL=user;
        this.passL=passL;
    }
    
    public String[] getUserCredentials()
    {
        String temp[] = {username,password};
        return temp;
    }
    
    public JLabel[] getLabels()
    {
        JLabel [] temp ={userL,passL}; 
        return temp;
    }
}