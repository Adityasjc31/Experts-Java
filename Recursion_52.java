import java.util.Scanner;
class Recursion_52
{
    public static int sumEvenDigits(int n)
    {
        if(n==0)
        {
            return 0;
        }
        else
        {
            return ((n%10)%2 == 0) ? (n%10 + sumEvenDigits(n/10)) : sumEvenDigits(n/10);
        }
    }

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number");
        int n=sc.nextInt();
        int sum=sumEvenDigits(n);
        System.out.println("sum of even digits = "+sum);
    }
}