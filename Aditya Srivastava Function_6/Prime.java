class Prime
{
    public static boolean isPrime(int n)
    {
        int b=1;
        for(int x=2 ; x<=n/2 ; x++)
        {
            if(n%x==0)
            {
                b++;
            }
        }
        return b==2;
    }
}