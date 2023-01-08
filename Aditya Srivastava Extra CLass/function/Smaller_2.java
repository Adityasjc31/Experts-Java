
package function;import java.util.*;
class Smaller_2
{
    public static void readfile()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1st Number");
        int a=sc.nextInt();
        System.out.println("Enter 2nd Number");
        int b=sc.nextInt();
        System.out.println("Smaller"+(a<b?a:b));
    }
}