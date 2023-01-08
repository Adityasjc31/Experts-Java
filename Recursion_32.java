import java.util.Scanner;
class Recursion_32
{
    public static int sum(int n)
    {
        if(n>1)
        {
            return n+sum(n-1);
        }
        else
        {
            return n;
        }
    }
    
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number");
        int n=sc.nextInt();
        int s=sum(n);
        System.out.println("sum is "+s);
    }
}