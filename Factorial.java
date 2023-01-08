
import java.util.*;
class Factorial
{
    public static double fact(double n)
    {
        double f=1;
        for(double x=1;x<=n;x++)
        {
            f*=x;
        }
        return f;
    }

    public static int DMAS(int a,int b,char ch)
    {
        {
            int a1=a<b ? a : b;
            int b1=a>b ? a : b;
            a=a1;
            b=b;
        }
        switch(ch)
        {
            case '+':
            return (int)(fact(a)+fact(b));

            case '-':
            return (int)(fact(a)-fact(b));

            case '*':
            return (int)(fact(a)*fact(b));

            case '/':
            return (int)(fact(a)/fact(b));

            case '%':
            return (int)(fact(a)%fact(b));

            default :
            return 0;
        }
    }
    static boolean t=false;
    public static void main(String args [],int m)
    {
        int n=input();
        System.out.println("Factorial of "+n+ " is : "+fact(n));
        if(t)
        {
            System.out.println("If any calculation is requried type the operator else enter anything other than the operator");
            char ch=new Scanner(System.in).next().charAt(0);
            if(ch=='+' || ch=='-' || ch=='*' || ch=='/' || ch=='%')
            {
                System.out.println(ch+ " of is : "+DMAS(n,m,ch));
            }
        }
        new Scanner(System.in).nextLine();
        System.out.println("To continue type continue else press -1");
        String c=new Scanner(System.in).nextLine();
        if(c.equalsIgnoreCase("1"))
        {
            t=true;
            main(null,n);
        }
        else if(!c.equalsIgnoreCase("-1"))
        {
            System.out.print("\f");
        }
        else
        {
            return ;
        }
    }

    public static int input()
    {
        return Value_Integer.take("Enter a number");
    }
}