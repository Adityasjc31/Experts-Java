package Objects_and_classes;

public class Call2
{
    public static void main(String args[])
    {
        Point p1=new Point();
        p1.input(3,5);
        Point p2=new Point();
        p2.input(4,6);
        
        System.out.println("Distance : "+(Point.distance(p1,p2)));
        
        Point p3=Point.midpoint(p1,p2);
        p3.display();
    }
}