import java.util.Scanner;
class Recursion_53
{
    public static int countDigits(int n)
    {
        if(n==0)
        {
            return 0;
        }
        else
        {
            return countDigits(n/10)+1;
        }
    }
    
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number");
        int n=sc.nextInt();
        int c=countDigits(n);
        System.out.println("Number of digits = "+c);
    }
}