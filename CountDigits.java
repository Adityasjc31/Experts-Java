class CountDigits
{
    static int n,c; 
    public CountDigits()
    {
        n=0;
        c=0;
    }

    public static void countDigits()
    {
        if(n>0)
        {
            int t=n;
            n/=10;
            c++;
            countDigits();
            n=t;
        }
    }
}