package prime;
import java.util.*;
class Prime_comma_line
{
    public static void main(String args [])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number");int a=sc.nextInt();
        System.out.println("Enter 2nd number");int b=sc.nextInt();
        int c=0;
        for(int x=a;x<=b;x++)
        {
            if(Prime.isPrime(x))
            {
                if(c>0)
                {
                    System.out.print(",");
                }
                if(c%5==0)
                {
                    System.out.println();
                }
                System.out.print(x);
                c++;
            }
        }
    }
}