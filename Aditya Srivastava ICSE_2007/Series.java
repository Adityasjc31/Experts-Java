import java.util.*;
class Series
{
    public static void main(String args [])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of n");int n=sc.nextInt();
        double s=0;
        for(int x=1;x<=n;x++)
        {
            double i=0,u=1;
            for(int y=1;y<=x;y++)
            {
                if(x==1)
                {
                    y++;
                }
                i = i+y;
                u = u*y;
            }
            s=s+(i+x)/(double)(u*x);
        }
        System.out.println("Sum = "+s);
    }
}