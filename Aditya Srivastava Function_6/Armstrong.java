class Armstrong
{
    public static boolean isArmstrong(int n)
    {
        int s=0;
        for(int x=n;x!=0;x=x/10)
        {
            int d=x%10;
            s=s+d*d*d;
        }
        return s==n;
    }
}