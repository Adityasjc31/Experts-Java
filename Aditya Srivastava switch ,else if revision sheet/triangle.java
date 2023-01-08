import java.util.Scanner;
class triangle
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
        if((a+b)>c||(a+c)>b||(b+c)>a)
        {
            if(a==b && a==c)
            {
                System.out.println("Equilateral triangle");
            }
            else if(a==b && a!=c||a==c&&a!=b||b==c&&b!=c)
            {
                System.out.println("Isoceles Triangle");
            }
            else
            {
                System.out.println("Scalene Triangle");
            }
        }
        else
        {
            System.out.println("Invalid input");
        }
    }
}