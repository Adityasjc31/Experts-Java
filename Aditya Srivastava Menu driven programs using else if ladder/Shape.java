import java.util.*;
class Shape
{
    public static void main(String args [])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter name of the Shape");
        String s=sc.next();
        if(s.equalsIgnoreCase("Square"))
        {
            System.out.println("Enter side");
            int si=sc.nextInt();
            System.out.println("Perimeter ="+(4*si));
        }
        else if(s.equalsIgnoreCase("Rectangle"))
        {
            System.out.println("Enter length");
            int l=sc.nextInt();
            System.out.println("Enter Breadth");
            int b=sc.nextInt();
            System.out.println("Perimeter="+(2*(l+b)));
        }
        else if(s.equalsIgnoreCase("Circle"))
        {
            System.out.println("Enter Radius");
            int r=sc.nextInt();
            System.out.println("Perimeter="+(Math.PI*2*r));
        }
        else
        {
            System.out.println("Invalid Shape");
        }
    }
}