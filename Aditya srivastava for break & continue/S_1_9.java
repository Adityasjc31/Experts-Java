class S_1_9
{
    public static void main()
    {
        int s=1;
        for(int x=1;x<=9;x++)
        {
            s=s*(x+(x+1));
        }
        System.out.println("Sum="+s);
    }
}