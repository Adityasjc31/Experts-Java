import java.util.*;
class scalene
{
    public static void main(String args [])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1st side");
        int a=sc.nextInt();
        System.out.println("Enter 2st side");
        int b=sc.nextInt();        
        System.out.println("Enter 3st side");
        int c=sc.nextInt();
        if(a!=b && b!=c && c!=a)
        {
            System.out.println("Scalene Triangle");
        }
        else
        {
            System.out.println("Not a Scalene Triangle");
        }
    }
}