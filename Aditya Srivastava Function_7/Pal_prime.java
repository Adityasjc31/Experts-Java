class Pal_prime
{
    public static boolean isPrime(int n)
    {
        int c=1;
        for(int x=2;x<=n/2;x++)
        {
            if(n%x==0)
            {
                return false;
            }
        }
        return true;
    }
    public static boolean isPalindrome(int n)
    {
        int r=0;
        for(int x=n ; x!=0 ; x=x/10)
        {
            int d=x%10;
            r=r*10+d;
        }
        return r==n;
    }
}