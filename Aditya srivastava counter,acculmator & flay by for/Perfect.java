import java.util.*;
class Perfect
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number : ");int n=sc.nextInt();
        int sum=0;
        for(int x=1;x<=n/2;x++)
        {
            if(n%x==0)
            {
                sum=sum+x;
            }
        }
        if(sum==n)
        {
            System.out.println("Perfect");
        }
        else
        {
            System.out.println("Not Perfect");
        }
    }
}