import java.util.*;
class Even
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");int n=sc.nextInt(),sum=0;
        for(int x=n;x!=0;x=x/10)
        {
            int d=x%10;
            if(d%2==0)
            {
                sum=sum+d;
            }
        }
        System.out.println("Sum of even digits = "+sum);
    }
}