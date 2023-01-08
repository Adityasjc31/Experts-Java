import java.util.Scanner;
class Recursion_31
{
    public static int factorial(int n)
    {
        return n<=1 ? 1 : n*factorial(n-1);
    }
    
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number");
        int n=sc.nextInt();
        int f=factorial(n);
        System.out.println("Factorial is "+f);
    }
}