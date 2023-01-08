import java.util.*;
class Shape
{
    public static void main(String args [])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Square\t-\t For Square");
        System.out.println("Rectangle\t-\t For Rectangle");
        System.out.println("Circle\t-\t For Circle");
        System.out.println("Enter name of the Shape");
        String s=sc.nextLine();
        String sp=s.toLowerCase();
        switch(sp)
        {
            case "square":
            System.out.println("Enter the side");
            double sm=sc.nextDouble();
            System.out.println("Perimeter="+(sm*sm));
            break;
            case "circle":
            System.out.println("Enter radius of a Circle");
            double r=sc.nextDouble();
            System.out.println("Perimeter="+(2*Math.PI*r));
            break;
            case "rectangle":
            System.out.println("Enter Length ");
            double l=sc.nextDouble();
            System.out.println("Enter Breadth");
            double b=sc.nextDouble();
            System.out.println("Perimeter="+(2*(l*b)));
            break;
            default:
            System.out.println("Invalid Input");
        }
    }
}