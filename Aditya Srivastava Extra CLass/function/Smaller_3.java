package function;
import java.util.*;
class Smaller_3
{
    public static void readfile()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1st Number");
        int a=sc.nextInt();
        System.out.println("Enter 2nd Number");
        int b=sc.nextInt();
        System.out.println("Enter 3rd Number");
        int c=sc.nextInt();
        System.out.println("Smaller is"+(a<b?(a<c?a:c):(b<c?b:c)));
    }
}