package Number_System;
import java.util.*;
class Decimal_Binary_Point
{
    public static String Binary(int n)
    {
        String b="";
        do
        {
            int r=n%2;
            b=r+b;
            n/=2;
        }while(n!=0);
        return b;
    }

    public static String Binary(double n)
    {
        int dpb=(int)n,c=0;
        double dpa=n-dpb;
        String bp=Binary(dpb)+".";
        do
        {
            dpa*=2;
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
        System.out.println("Binary Number : "+(n.indexOf('.')>-1 ? Binary(Double.valueOf(n)) : Binary(Integer.valueOf(n))));
    }
}