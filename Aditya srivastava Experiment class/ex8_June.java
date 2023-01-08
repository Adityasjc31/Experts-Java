class ex8_June
{
    public static void main()
    {
        int x=1;
        while(x<=5)
        {
            if(x==3)
            {
                for(int u=1;u<=2;u++)
                {
                    continue;
                }
                System.exit(1000);
            }
            System.out.println(x);x++;
        }
    }
}