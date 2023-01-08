import java.util.*;
class Abs
{
    public static void main()
    {
        Scanner sc =new Scanner (System.in);
        System.out.println("Enter a Number");
        int n=sc.nextInt();
        if(n<0)
        {
            n=n*-1;
        }
        System.out.println("Absolute Value = "+n);
    }
}