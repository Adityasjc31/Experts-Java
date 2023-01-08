class Fraction
{
    int n,d;
    public Fraction(int n,int d)
    {
        this.n=n;
        this.d=d;
    }
    
    public Fraction(int n)
    {
        this(n,1);
    }
    
    public Fraction()
    {
        this(0,1);
    }
    
    public void display()
    {
        System.out.println("fraction = " +n+"/"+d);
    }
    
    public void reduce()
    {
        int s=n<d?n:d;int h=0;
        for(int x=1 ;x<=s;x++)
        {
            if(n%x==0 && d%x==0)
            {
                h=x;
            }
        }
        n=n/h;
        d=d/h;
    }
}