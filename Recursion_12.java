import java.util.Scanner;
class Recursion_12
{
    public static void display(int n)
    {
        if(n>=1)
        {
            display(n-1);
            System.out.println(n);
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