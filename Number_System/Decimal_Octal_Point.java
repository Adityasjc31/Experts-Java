package Number_System;
import java.util.*;
class Decimal_Octal_Point
{
    public static String Octal(int n)
    {
        String b="";
        do
        {
            int r=n%8;
            b=r+b;
            n/=8;
        }while(n!=0);
        return b;
    }

    public static String Octal(double n)
    {
        int dpb=(int)n,c=0;
        double dpa=n-dpb;
        String bp=Octal(dpb)+".";
        do
        {
            dpa*=8;
            bp=bp+(int)dpa;
            dpa=dpa-(int)dpa;
            c++;
        }while(dpa!=0 && c<10);
        return bp;
    }

    public static void main(String args [])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");String n=sc.next();
        System.out.println("Octal Number : "+(n.indexOf('.')>-1 ? Octal(Double.valueOf(n)) : Octal(Integer.valueOf(n))));
    }
}