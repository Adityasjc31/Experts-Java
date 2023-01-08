class factor
{
    public static int d(int n)
    {
        int c=0;
        for(int x=2;x<=n;x++)
        {
            if(n%x==0)
            c++;
        }
        c++;
        return c;
    }
}