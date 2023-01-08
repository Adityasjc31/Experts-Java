package tempClass12.Exam;

import java.util.*;
class Special
{
    int n;
    public Special()
    {
        n=0;
    }
    
    public void read()
    {
        System.out.println("Enter a number");
        n = new Scanner(System.in).nextInt();
    }
    
    public int factorial(int x)
    {
        if(x==0)
        {
            return 1;
        }
        else
        {
            return x * factorial(x-1);
        }
    }
    
    public boolean isSpecial()
    {
        int sum=0;
        for(int x=n;x!=0;x=x/10)
        {
            int t=x%10;
            sum+=factorial(t);
        }
        
        if(sum==n)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public void display()
    {
        System.out.println(isSpecial() ? "Special Number" : "Not a special number");
    }
}