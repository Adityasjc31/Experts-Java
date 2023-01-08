import java.util.*;
class Prime
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter small Number");int s=sc.nextInt();
        System.out.println("Enter big Number");int b=sc.nextInt();
        for(int x=s ; x<=b ; x++)
        {
            if(Number.isPrime(x))
            {
                System.out.println(x);
            }
        }
    }
}