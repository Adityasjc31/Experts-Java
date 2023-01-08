class Sum
{
    public static int d(int n)
    {
        int s=0;
        while(n!=0)
        {
            int d= n%10;
            s=s+d;
            n/=10;
        }
        return s;
    }
}