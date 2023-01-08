import java.util.*;
class RCS
{
    public static void main(String args [])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("1\t-\tArea of Circle\n2\t-\tArea of Square\n3\t-\tArea Rectangle");
        System.out.println("Enter your Choice");
        int c=sc.nextInt();
        switch(c)
        {
            case 1:
            System.out.println("Enter Radius Of A Circle");
            double r=sc.nextDouble();
            double ar=(22.0/7)*r*r;
            System.out.println("Area ="+ar);
            break;
            case 2:
            System.out.println("Enter the Side of the Square");
            double s=sc.nextDouble();
            double aer=s*s;
            System.out.println("Area ="+aer);
            break;
            case 3:
            System.out.println("Enter Length ");
            double l=sc.nextDouble();
            System.out.println("Enter Breadth");
            double b=sc.nextDouble();
            System.out.println("Area ="+(l*b));
            break;
            default:
            System.out.println("Invalid Choice");
        }
    }
}