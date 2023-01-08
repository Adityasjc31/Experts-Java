class Pattern_6
{
    public static void main()
    {
        for(int x=9;x>=4;x--)
        {
            for(int y=x;y>=5;y--)
            {
                System.out.print(" ");
            }
            
            for(int y=9;y>=x;y--)
            {
                System.out.print(y);
            }
            
            for(int y=(x+1);y<=9;y++)
            {
                System.out.print(y);
            }
            System.out.println();
        }
    }
}