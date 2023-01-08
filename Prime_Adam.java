import java.util.*;
class Prime_Adam
{
    public static boolean isPrime(int n)
    {
        int c=1;
        for(int x=2;x<=n/2;x++)
        {
            if(n%x == 0)
            {
                c++;
                break;
            }
        }
        return c==1;
    }
    
    public static boolean isAdam(int n)
    {
        int n1 = n*n;
        int n2 = reverse(n);
        int n3 = n2*n2;
        int n4 = reverse(n3);
        return n1==n4;
    }
    
    private static int reverse(int n)
    {
        int r = 0;
        for(int x=n;x!=0;x/=10)
        {
            r = r*10 + (x%10);
        }
        return r;
    }
    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("m = ");
        int m = sc.nextInt();
        System.out.print("n = ");
        int n = sc.nextInt();
        if(m>n)
        {
            System.out.println("INVALID INPUT");
            return ;
        }
        System.out.println("THE PRIME-ADAM INTEGERS ARE:");
        int c=0;
        for(int x=m;x<=n;x++)
        {
            if(isAdam(x) && isPrime(x))
            {
                System.out.print(x+" ");
                c++;
            }
        }
        System.out.println("\nFREQUENCY OF PRIME-ADAM INTEGERS IS: "+c);
    }
}