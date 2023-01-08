class Number
{
    public static boolean isPrime(int n)
    {
        for(int x=2;x<=n/2;x++)
        {
            if(n%x==0)
            {
                return false;
            }
        }
        return true;
    }
}