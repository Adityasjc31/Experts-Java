import java.util.*;
class Neon
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number");int n=sc.nextInt();
        int s=n*n;
        int x=s;int sum=0;
        while(x!=0)
        {
            int d=x%10;
            sum+=d;
            x=x/10;
        }
        if(n==sum)
        {
            System.out.println("Neon Number");
        }
        else
        {
            System.out.println("Not a Neon Number");
        }
    }
}