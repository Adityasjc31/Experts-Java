package isc2012; 

import java.util.*;
class Happy
{
    int n;
    Happy()
    {
        n=0;
    }

    void getnum(int nn)
    {
        n=nn;
    }

    int sum_sq_digits(int x)
    {
        if (x>0)
        {
            return ((x%10)*(x%10)) + (sum_sq_digits (x/10));
        }
        else
        {
            return 0;
        }
    }
    
    void ishappy()
    {
        int x=n;
        while(x>9)
        {
            x=sum_sq_digits(x);
        }
        if(x == 1)
        {
            System.out.println("Happy Number");
        }
        else
        {
            System.out.println("Not a Happy Number");
        }
    }
    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int n = sc.nextInt();
        Happy ob = new Happy();
        ob.getnum(n);
        ob.ishappy();
    }
}