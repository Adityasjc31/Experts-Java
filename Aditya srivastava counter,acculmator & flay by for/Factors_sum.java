import java.util.*;
class Factors_sum
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
                c+=x;
            }
        }
        System.out.println("Sum="+c);
    }
}