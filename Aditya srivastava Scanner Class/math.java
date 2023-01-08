import java.util.*;
class math
{
    public static void main(String args [])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Perpendicular");
        int a=sc.nextInt();
        System.out.println("Enter Base");
        int b=sc.nextInt();
        double h=Math.sqrt((Math.pow(a,2))+(Math.pow(b,2)));
        System.out.println("Hypotenuse="+h);
    }
}