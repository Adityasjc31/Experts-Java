import java.util.Scanner;
class Recursion_51
{
    public static int sumDigits(int n)
    {
        if(n==0)
        {
            return 0;
        }
        else
        {
            return n%10 + sumDigits(n/10);
        }
    }

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number");
        int n=sc.nextInt();
        int sum=sumDigits(n);
        System.out.println("sum of the digits = "+sum);
    }
}