import java.util.Scanner;
class Area
{
    public static void main(String args [])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("1 - Area of a Circle");
        System.out.println("2 - Area of a Square");
        System.out.println("3 - Area of a Rectangle");
        System.out.println("Enter your Choice");
        int c=sc.nextInt();
        if(c==1)
        {
            System.out.println("Enter Radius Of A Circle");
            double r=sc.nextDouble();
            double ar=(22.0/7)*r*r;
            System.out.println("Area ="+ar);
        }
        else if(c==2)
        {
            System.out.println("Enter the Side of the Square");
            double s=sc.nextDouble();
            double ar=s*s;
            System.out.println("Area ="+ar);
        }
        else if(c==3)
        {
            System.out.println("Enter Length ");
            double l=sc.nextDouble();
            System.out.println("Enter Breadth");
            double b=sc.nextDouble();
            System.out.println("Area ="+(l*b));
        }
        else
        {
            System.out.println("Invalid Choice");
        }
    }
}