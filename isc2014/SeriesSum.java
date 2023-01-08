package isc2014; 

import java.util.*;
class SeriesSum
{
    int x,n;
    double sum;
    SeriesSum(int xx,int nn)
    {
        x=xx;
        n=nn;
        sum=0.0;
    }
    
    double findfact(int m)
    {
        if(m<=1)
        {
            return 1;
        }
        else
        {
            return m * findfact(m-1);
        }
    }
    
    double findpower(int x,int y)
    {
        if(y==0)
        {
            return 1;
        }
        else
        {
            return x * findpower(x,y-1);
        }
    }
    
    void calculate()
    {
        for(int i=2;i<=n;i+=2)
        {
            sum = sum + findpower(x,i)/findfact(i-1) ;
        }
    }
    
    void display()
    {
        System.out.println("Sum of the series = "+sum);
    }
    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of x ");
        int x=sc.nextInt();
        System.out.println("Enter value of n");
        int n=sc.nextInt();
        
        SeriesSum sm = new SeriesSum(x,n);
        sm.calculate();
        sm.display();
    }
}