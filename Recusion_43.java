import java.util.Scanner;
class Recusion_43
{
    public static int fib_num(int n)
    {
        if(n>2)
        {
            return fib_num(n-1)+fib_num(n-2);
        }
        else if(n==2)
        {
            return 1;
        }
        else
        {
            return 0;
        }
    }

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value of n");
        int n=sc.nextInt();
        System.out.println("Fibonacci number is "+fib_num(n));
    }
}