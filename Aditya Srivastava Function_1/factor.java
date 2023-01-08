class factor
{
    public static void d(int n)
    {
        System.out.println("Factors are : ");
        for(int x=1;x<=n;x++)
        {
            if(n%x==0)
            System.out.println(x);
        }
    }
}