package Number_System;
import java.util.*;
class Octal_Binary
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

    public static String toOctal(String n)
    {
        String dt="";
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
            dt=Decimal_Binary_Point.Binary(De);
        }
        else
        {
            a=n;b="";
            De=Octal(a);
            dt=Decimal_Binary_Point.Binary(De);
        }
        /*int i1=dt.indexOf('.');
        String x=dt.substring(0,i1);
        String y=dt.substring(i1+1);
        int si1=x.indexOf('1'),si2=y.lastIndexOf('1');
        String p=x.substring(si1);
        String q=y.substring(si2);*/
        return dt;
    }
    
    public static void main(String args [])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an Octal Number : ");String s=sc.next();
        System.out.println("Binary Number : "+toOctal(s));
    }
}