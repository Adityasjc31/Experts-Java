import java.util.*;
class Even
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");int n=sc.nextInt(),sum=0;
        while(n!=0)
        {
            int d=n%10;
            if(d%2==0)
            {
                sum=sum+d;
            }
            n=n/10;
        }
        System.out.println("Sum of even digits = "+sum);
    }
}