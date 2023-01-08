package Number_System;
import java.util.*;
class Octal_Decimal_Point
{
    public static int Octal(String n)
    {
        int De=0,c=0;
        for(int x=n.length()-1;x>=0;x--)
        {
            char ch=n.charAt(x);
            De+=((int)ch-48)*(int)Math.pow(8,c++);
        }
        return De;
    }

    public static double toOctal(String n)
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
                De=De+((ch-48)*Math.pow(8,-1*(c+1)));
                c++;
            }while(c<b.length() && c<10);
            De=De+(double)Octal(a);
        }
        else
        {
            a=n;b="";
            De=Octal(a);
        }

        return De;
    }
    
    public static void main(String args [])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Octal number");String n=sc.next();
        System.out.println("Decimal Number : "+toOctal(n));
    }
}