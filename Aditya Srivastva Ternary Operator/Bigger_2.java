import java.util.*;
class Bigger_2
{
    public static void readfile()
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter 1st Number");
        int a=sc.nextInt();
        System.out.println("Enter 2nd Number");
        int b=sc.nextInt();
        System.out.println("Bigger is "+(a>b?a:b));
    }
}