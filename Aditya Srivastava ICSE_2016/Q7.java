class Q7 extends A
{
    void SumSeries(int n,double x)
    {
        double sum=0.0;
        for(int a=1 ; x<=n ;x++)
        {
            if(a%2==1)
            {
                sum=sum+Math.pow(x,a);
            }
            else
            {
                sum=sum-Math.pow(x,a);
            }
        }

        System.out.println("Sum = "+sum);
    }

    void SumSeries()
    {
        double sum=1.0;
        for(int x=1 ;x<=20; x++)
        {
            int f=1;
            for(int y=1;y<=x;y++)
            {
                f*=y;
            }
            sum+=f;
        }
        System.out.println("s = "+sum);
    }
}