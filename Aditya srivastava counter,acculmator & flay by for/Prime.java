import java.util.*;
class Prime
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number : ");int n=sc.nextInt();
        int c=0;
        for(int x=1;x<=n;x++)
        {
            if(n%x==0)
            {
                c++;
            }
        }
        if(c==2)
        {
            System.out.println("Prime");
        }
        else
        {
            System.out.println("Not Prime");
        }
    }
}