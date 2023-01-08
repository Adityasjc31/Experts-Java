package Number_System;
import java.util.*;
class Decimal_HexaDecimal_Point
{
    public static String HexaDecimal(int n)
    {
        String b="";
        do
        {
            int r=n%16;
            if(r>9)
            {
                b=(char)(r+55)+b;
            }
            else
            {
                b=r+b;
            }
            n/=16;
        }while(n!=0);
        return b;
    }

    public static String HexaDecimal(double n)
    {
        int dpb=(int)n,c=0;
        double dpa=n-dpb;
        String bp=HexaDecimal(dpb)+".";
        do
        {
            dpa*=16;
            if(dpa>9)
            {
                bp=bp+(char)((int)dpa+55);
            }
            else
            {
                bp=bp+(int)dpa;
            }
            dpa=dpa-(int)dpa;
            c++;
        }while(dpa!=0 && c<10);
        return bp;
    }

    public static void main(String args [])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");String n=sc.next();
        System.out.println("HexaDecimal Number : "+(n.indexOf('.')>-1 ? HexaDecimal(Double.valueOf(n)) : HexaDecimal(Integer.valueOf(n))));
    }
}