import java.util.Scanner;
class Recursion_21
{
    public static void toBinary(int n)
    {
        if(n==0)
        {
            System.out.print(n);
        }
        else if(n==1)
        {
            System.out.print(n);
        }
        else
        {
            toBinary(n/2);
            System.out.print(n%2);
        }
    }
    
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number");
        int n=sc.nextInt();
        toBinary(n);
    }
}