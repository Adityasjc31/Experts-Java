import java.util.*;
class rectangle
{
    public static void main(String args [])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of the rectangle");
        int l=sc.nextInt();
        System.out.println("Enter the breadth of the rectangle");
        int b=sc.nextInt();
        System.out.println("Area of the rectangle="+(l*b)+","+"Perimeter of the rectangle="+(2*(l+b)));
        System.out.println();
    }
}