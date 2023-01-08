import java.util.*;
class isoceles
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
        if(a==b||b==c||c==a)
        {
            System.out.println("Isoceles Triangle");
        }
        else
        {
            System.out.println("Not an Isoceles Triangle");
        }
    }
}