import java.util.*;
class Volume
{
    public static void main(String args [])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("1 - Volume of a Cube");
        System.out.println("2 - Volume of a Cubiod");
        System.out.println("3 - Volume of a Sphere");
        System.out.println("Enter your Choice");
        int s=sc.nextInt();
        if(s==1)
        {
            System.out.println("Enter side");
            int si=sc.nextInt();
            System.out.println("Volume ="+(si*si*si));
        }
        else if(s==2)
        {
            System.out.println("Enter length");
            int l=sc.nextInt();
            System.out.println("Enter Breadth");
            int b=sc.nextInt();
            System.out.println("Enter Height");
            int h=sc.nextInt();
            System.out.println("Volume="+(l*b*h));
        }
        else if(s==3)
        {
            System.out.println("Enter Radius");
            int r=sc.nextInt();
            System.out.println("Volume="+((22/Math.PI)*(4/3)*(double)r));
        }
        else
        {
            System.out.println("Invalid Input");
        }
    }
}