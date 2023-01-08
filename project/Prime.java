package project;

import java.util.*;
class Prime
{
    private static int countNumberOfDivisors(int n,int i)
    {
        if(i<=n)
        {
            if(n%i==0)
            {
                return 1+countNumberOfDivisors(n,++i);
            }
            else
            {
                return countNumberOfDivisors(n,++i);
            }
        }
        else
        {
            return 0;
        }
    }

    public static boolean CountisPrime(int n)
    {
        return countNumberOfDivisors(n,1)==2 ? true : false;
    }

    public static boolean HelperisPrime(int n,int d)
    {
        if(d<n)
        {
            if(n%d!=0)
            {
                return HelperisPrime(n,++d);
            }
            else
            {
                return false;
            }
        }
        else
        {
            return true;
        }
    }
    
    public static boolean isPrime(int n)
    {
        return HelperisPrime(n,n+1);
    }
    
    public static void main(String args [])
    {
        System.out.println("Enter a number to check whether it is prime or not");
        int n=new Scanner(System.in).nextInt();
        System.out.println("The number is "+(isPrime(n) ? "Prime" : "Not Prime"));
    }
}