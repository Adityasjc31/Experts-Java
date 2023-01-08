package prime;
public class Prime
{
    public static boolean isPrime(int n)
    {
        int r=(int)Math.sqrt(n);
        for(int x=2;x<=r;x++)
        {
            if(n%x==0)
            {
                return false;
            }
        }
        return true;
    }
}