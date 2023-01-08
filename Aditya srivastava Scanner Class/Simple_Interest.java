import java.util.*;
class Simple_Interest
{
    public static void main(String args [])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter principle");
        int l=sc.nextInt();
        System.out.println("Enter Rate of Interest");
        int b=sc.nextInt();
        System.out.println("Enter Time");
        int c=sc.nextInt();
        double si=((double)(l*b*c)/100);
        System.out.println("Simple Interest="+si+"-/");
        System.out.println();
    }
}