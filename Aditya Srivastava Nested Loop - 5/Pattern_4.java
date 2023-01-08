class Pattern_4
{
    public static void main()
    {
        for(int x=4;x<=8;x++)
        {
            for(int y=x;y<=7;y++)
            {
                System.out.print(" ");
            }
            
            for(int y=4;y<=x;y++)
            {
                System.out.print(y);
            }
            
            for(int y=(x-1);y>=4;y--)
            {
                System.out.print(y);
            }
            System.out.println();
        }
    }
}