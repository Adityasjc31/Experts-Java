import java.util.*;
class Geo_Figure
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter sides of a geometrical figure (sides less than or equal 10 & greater than equal to 3)");
        int x=sc.nextInt();
        if(x==3)
        {
            System.out.println("Triangle");
        }
        else if(x==4)
        {
            System.out.println("Square");
        }
        else if(x==5)
        {
            System.out.println("Pentagon");
        }
        else if(x==6)
        {
            System.out.println("Hexagon");
        }
        else if(x==7)
        {
            System.out.println("Septagon");
        }
        else if(x==8)
        {
            System.out.println("Octagon");
        }
        else if(x==9)
        {
            System.out.println("Nanogon");
        }
        else
        {
            System.out.println("Decagon");
        }
    }
}