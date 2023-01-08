package Gui.trying;

import java.util.*;
public class SignInScreen extends EventObject
{
    private ToolBar tb;
    private SignUp su;
    public SignInScreen(Object src,ToolBar t)
    {
        super(src);
        tb=t;
    }
    
    public SignInScreen(Object src,SignUp t)
    {
        super(src);
        su=t;
    }
}