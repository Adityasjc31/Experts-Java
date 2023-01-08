import java.util.*;
class triangle
{
    public static void main(String args [])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter First Side");
        int a=sc.nextInt();
        System.out.println("Enter Second Side");
        int b=sc.nextInt();
        System.out.println("Enter Thrid Side");
        int c=sc.nextInt();
        double s=(a+b+c)/2.0;
        double ar=Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println("Area of the triangle="+ar);
    }
}