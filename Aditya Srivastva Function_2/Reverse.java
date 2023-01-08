class Reverse
{
    public static int d(int n)
    {
        int r=0;
        for(int x=n;x!=0;x=x/10)
        {
            r = r*10 +(x%10);
        }
        return r;
    }
}