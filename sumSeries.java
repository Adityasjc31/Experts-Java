import java.util.*;
class sumSeries
{
    int x,n;
    double sum;
    public sumSeries()
    {
        x=n=0;
        sum=0.0;
    }

    public void readLimit()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of numerator");
        x=sc.nextInt();
        System.out.println("Enter last term");
        n=sc.nextInt();
    }

    public int getPower(int m,int p)
    {
        if(p>1)
        {
            m=m*m;
            p--;
            return getPower(m,p);
        }
        else
        {
            return m;
        }
    }
    
    public void calculate()
    {
        for(int i=2,j=1;i<=n;i+=2,j++)
        {
            sum+=getPower(x,i)/(double)getPower((x-1),j);
        }
    }
    
    public void display()
    {
        System.out.println("Sum = "+sum);
    }
    
    public static void main(String args [])
    {
        sumSeries s=new sumSeries();
        s.readLimit();
        s.calculate();
        s.display();
    }
}