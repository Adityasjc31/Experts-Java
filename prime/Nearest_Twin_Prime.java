package prime;
import java.util.*;
class Nearest_Twin_Prime
{
    public static void main(String args [])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number");
        int n=sc.nextInt();
        if(Prime.isPrime(n-1) && Prime.isPrime(n+1))
        {
            System.out.println((n-1)+"-"+(n+1));
        }
        else
        {
            int d=0;
            boolean f=false;
            while(!f)
            {
                if(Prime.isPrime(n-d-2) && Prime.isPrime(n-2))
                {
                    System.out.println((n-d-2)+"-"+(n+d));
                    f=true;
                }
                
                if(Prime.isPrime(n+d) && Prime.isPrime(n+d+2))
                {
                    System.out.println((n+d)+"-"+(n+2+d));
                    f=true;
                }
                d++;
            }
        }
    }
}