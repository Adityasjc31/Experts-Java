import java.util.Scanner;
class Recursion_22
{
    public static void toOctal(int n)
    {
        if(n>7)
        {
            toOctal(n/8);
        }
        System.out.print(n%8);
    }
    
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number");
        int n=sc.nextInt();
        toOctal(n);
    }
}