import java.util.Scanner;
class Recursion_11
{
    public static void display(int n)
    {
        if(n>=1)
        {
            System.out.println(n);
            display(n-1);
        }
    }
    
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number");
        int n=sc.nextInt();
        display(n);
    }
}