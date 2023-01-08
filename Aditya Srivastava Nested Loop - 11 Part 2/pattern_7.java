class pattern_7
{
    public static void main()
    {
        for(int x=3;x<=7;x++)
        {
            for(int y=x;y<=7;y++)
            {
                System.out.print(y);
            }
            
            for(int y=1;y<=x*2-7;y++)
            {
                System.out.print(" ");
            }
            
            for(int y=(x==3 ? 6:7);y>=x;y--)
            {
                System.out.print(y);
            }
            System.out.println();
        }
    }
}