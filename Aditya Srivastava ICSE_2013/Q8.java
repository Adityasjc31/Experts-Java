import java.util.*;
class Q8
{
    double series(double n)
    {
        double sum=0.0;
        for(int x=1;x<=n;x++)
        {
            sum=sum+(1/x);
        }
        return sum;
    }
    
    double series(double a , double n)
    {
        double sum=0.0;
        for(int x=1,k=2;x<=n;x+=3,k+=3)
        {
            sum=sum+x/Math.pow(a,k);
        }
        return sum;
    }
}