import java.util.*;
class var
{
    private int I;
    private double D;
    private long L;
    private byte B;
    private float F;
    private short S;
    private char C;
    private String s;
    public var()
    {
    }

    public var(byte t)
    {
        B=t;
    }

    public var(short t)
    {
        S=t;
    }

    public var(int t)
    {
        I=t;
    }

    public var(long t)
    {
        L=t;
    }

    public var(float t)
    {
        F=t;
    }

    public var(double t)
    {
        D=t;
    }

    public var(char t)
    {
        C=t;
    }

    public var(String t)
    {
        s=t;
    }

    public void input()
    {
        Scanner sc = new Scanner(System.in);
        String t=sc.nextLine();
        if(t.length() >= 10)
        {
            if(t.indexOf('.')!=-1)
            {
                L = Long.parseLong(t);
            }
            else
            {
                D = Double.parseDouble(t);
            }
        }
    }

    public static boolean checkNum(String t)
    {
        for(int x=0;x<t.length();x++)
        {
            char ch = t.charAt(x);
            if(!((ch-65)>=0 && (ch-65)<=26) || !((ch-97)>=0 && (ch-97)<=26) || ch!='.')
            {
                return false;
            }
        }
        return true;
    }

    public static void main(String args[])
    {
        var v = new var();
        v.input();
    }
}