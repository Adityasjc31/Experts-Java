import java.util.Scanner;
class Recusion_42
{
    public static int gcd(int b,int s)
    {
        if(b%s==0)
        {
            return s;
        }
        else
        {
            return gcd(s,b%s);
        }
    }

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number");
        int n1=sc.nextInt();
        System.out.println("Enter second number");
        int n2=sc.nextInt();
        int gcd=gcd(n1,n2);
        System.out.println("GCD = "+gcd);
    }
}