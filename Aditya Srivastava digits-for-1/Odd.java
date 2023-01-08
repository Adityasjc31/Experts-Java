import java.util.*;
class Odd
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number"
        );int n=sc.nextInt(),c=0;
        for(int x=n;x!=0;x=x/10)
        {
            int d=x%10;
            if(d%2!=0)
            {
                c++;
            }
        }
        System.out.println("Odd numbers present are "+c);
    }
}