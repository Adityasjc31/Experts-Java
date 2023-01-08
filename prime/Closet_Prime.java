package prime;
import java.util.*;
class Closet_Prime
{
    public static void main(String args [])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number");
        int n=sc.nextInt();
        if(Prime.isPrime(n))
        {
            System.out.println(n);
        }
        else
        {
            int d=1;
            boolean f=false;
            while(!f)
            {
                if(Prime.isPrime(n-d))
                {
                    System.out.println(n-d);
                    f=true;
                }
                
                if(Prime.isPrime(n+d))
                {
                    System.out.println(n+d);
                    f=true;
                }
                d++;
            }
        }
    }
}