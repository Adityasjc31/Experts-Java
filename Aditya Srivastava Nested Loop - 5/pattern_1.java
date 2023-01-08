class pattern_1
{
    public static void main()
    {
        for(int x=8;x>=4;x--)
        {
            for(int y=x;y>=5;y--)
            {
                System.out.print(" ");
            }
            
            for(int y=8;y>=x;y--)
            {
                System.out.print(x);
            }
            System.out.println();
        }
    }
}