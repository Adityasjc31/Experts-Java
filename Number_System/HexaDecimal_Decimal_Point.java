package Number_System;
import java.util.*;
class HexaDecimal_Decimal_Point
{
    public static int Decimal(String hex)
    {
        int de=0;
        hex=hex.toUpperCase();
        for(int x=hex.length()-1,p=0;x>=0;x--,p++)
        {
            char ch=hex.charAt(x);
            if(Character.isLetter(ch) && (ch>='A' && ch<='F'))
            {
                de=de+((ch-55)*(int)Math.pow(16,p));
            }
            else
            {
                de=de+((ch-48)*(int)Math.pow(16,p));
            }
        }
        return de;
    }

    public static double Decimalpoint(String hex)
    {
        double de=0;
        hex=hex.toUpperCase();
        String a,b;
        if(hex.indexOf('.')>-1)
        {
            a=hex.substring(0,hex.indexOf('.'));
            b=hex.substring(hex.indexOf('.')+1);int p=0;
            do
            {
                char ch=b.charAt(p);
                if(Character.isLetter(ch) && (ch>='A' && ch<='F'))
                {
                    de=de+((ch-55)*Math.pow(16,-1*(p+1)));
                }
                else
                {
                    de=de+((ch-48)*Math.pow(16,-1*(p)));
                }
                p++;
            }while(p<b.length() && p<10);
            de=de+(double)Decimal(a);
        }
        else
        {
            b="";a=hex;
            de=de+Decimal(a);
        }
        return de;
    }
    
    public static void main(String args [])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter HexaDecimal Number : ");
        String n=sc.next();
        System.out.println("Decimal Number : "+Decimalpoint(n));
    }
}