import java.util.*;
class sq__cb_c
{
    public static void main(String args [])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any Number");
        int a=sc.nextInt();
        int s=a*a;
        System.out.println("Square :"+s);
        int c=a*a*a;
        System.out.println("Cube :"+c);
        double sq=Math.sqrt(a);
        System.out.println("Square root :"+sq);
        double cb=Math.cbrt(a);
        System.out.print("Square root :"+cb);
       }
}