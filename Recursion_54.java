import java.util.Scanner;
class Recursion_54
{
    public static int countEvenDigits(int n)
    {
        if(n%10 == 0)
        {
            return 0;
        }
        else
        {
            int d=n%10;
            if(d%2 == 0)
            {
                return 1 + countEvenDigits(n/10);
            }
            return countEvenDigits(n/10);
        }
    }
    
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number");
        int n=sc.nextInt();
        int c=countEvenDigits(n);
        System.out.println("Number of Even digits = "+c);
    }
}