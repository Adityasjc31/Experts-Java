package Number_System;
import java.util.*;
class Binary_Decimal_Point
{
    public static int Decimal(String n)
    {
        int De=0,c=0;
        for(int x=n.length()-1;x>=0;x--)
        {
            char ch=n.charAt(x);
            De+=((int)ch-48)*(int)Math.pow(2,c++);
        }
        return De;
    }

    public static double toDecimal(String n)
    {
        double De=0.0;String a,b;
        if(n.indexOf('.')>-1)
        {
            a=n.substring(0,n.indexOf('.'));
            b=n.substring(n.indexOf('.')+1);
            int c=0;

            do 
            {
                char ch=b.charAt(c);
                int x=ch-48;
                double y=Math.pow(2,-1*(c+1));
                De=De+((ch-48)*Math.pow(2,-1*(c+1)));
                c++;
            }while(c<b.length() && c<10);
            De=De+(double)Decimal(a);
        }
        else
        {
            a=n;b="";
            De=Decimal(a);
        }

        return De;
    }
    
    public static void main(String args [])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Binary number");String n=sc.next();
        System.out.println("Decimal Number : "+toDecimal(n));
    }
}