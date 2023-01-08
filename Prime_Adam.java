import java.util.*;
class Prime_Adam
{
    public static boolean isPrime(int n)
    {
        for(int x=2;x<=n/2;x++)
        {
            if(n%x==0)
            {
                return false;
            }
        }
        return true;
    }

    public static int reverse(int n)
    {
        int rev=0;
        for(int x=n;x!=0;x/=10)
        {
            rev=rev*10+(x%10);
        }
        return rev;
    }

    public static boolean isAdam(int n)
    {
        return reverse(reverse(n)*reverse(n))==n*n;
    }
    
    public static void display(int m,int n)
    {
        System.out.println("THE PRIME-ADAM INTEGERS ARE : ");
        int c=0;
        for(int x=m;x<=n;x++)
        {
            if(isPrime(x) && isAdam(x))
            {
                System.out.print(x+"\t");
                c++;
            }
        }
        if(c==0)
        {
            System.out.print("NIL");
        }
        System.out.println("\nFREQUENCY OF PRIME-ADAM INTEGERS ARE : "+c);
    }
    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter lower bound");
        int l=sc.nextInt();
        System.out.println("Enter upper bound");
        int u=sc.nextInt();
        if(l>u)
        {
            System.out.println("INVALID INPUT");
        }
        else
        {
            display(l,u);
        }
    }
}