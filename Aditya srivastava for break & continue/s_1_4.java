class s_1_4
{
    public static void main()
    {
        int s=0;
        int b=2,x=1;
        for(;x<=4;)
        {
            int m=x*b;
            s=s+m;
            x=b;
            b++;
        }
        System.out.println("Sum="+s);
    }
}