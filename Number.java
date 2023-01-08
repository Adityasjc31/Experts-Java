class Number
{
    int n,r;
    public Number(int nn)
    {
        n=nn;
        r=0;
    }
    
    public void reverse()
    {
        if(n>0)
        {
            int t=n;
            int d=n%10;
            r = r*10+ d;
            n=n/10;
            reverse();
            n = t;
        }
    }
}