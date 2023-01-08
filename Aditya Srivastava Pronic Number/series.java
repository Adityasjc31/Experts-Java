import java.util.*;
class series
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value of n");
        int n=sc.nextInt();
        int s=0;
        for(int x=2;x<=n;x+=2)
        {
            s=s+((x-1)*x);
        }
        System.out.println("Sum = "+s);
    }
}