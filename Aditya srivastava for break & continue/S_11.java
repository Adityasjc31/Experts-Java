class S_11
{
    public static void main()
    {
        double s=0;
        for(int x=1;x<=10;x++)
        {
            s=s+(double)x/(11-x);
        }
        System.out.println("Sum="+s);
    }
}