import java.util.*;
class trangle
{
    public static void main(String args [])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of one side of the triangle");
        int l=sc.nextInt();
        System.out.println("Enter the length of second side of the triangle");
        int b=sc.nextInt();
        System.out.println("Third side of the triangle="+(180-(l+b))+"degrees");
    }
}