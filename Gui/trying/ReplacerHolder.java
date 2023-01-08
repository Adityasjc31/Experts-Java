package Gui.trying;

import java.util.*;
public class ReplacerHolder extends EventObject
{
    private Credentials cred;
    public ReplacerHolder(Object src,Credentials c)
    {
        super(src);
        cred=c;
    }

    public Credentials getReplacer()
    {
        return cred;
    }
}