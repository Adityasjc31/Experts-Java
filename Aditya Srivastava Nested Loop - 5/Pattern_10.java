class Pattern_10
{
    public static void main()
    {
        for(int x=1;x<=5;x++)
        {
            for(int y=4;y>=x;y--)
            {
                System.out.print(" ");
            }
            
            for(int y=x;y>=1;y--)
            {
                System.out.print(y);
            }
            
            for(int y=2;y<=x;y++)
            {
                System.out.print(y);
            }
            System.out.println();
        }
    }
}