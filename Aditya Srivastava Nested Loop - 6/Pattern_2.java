class Pattern_2
{
    public static void main()
    {
        for(int x=3;x<=7;x++)
        {
            for(int y=x;y<=6;y++)
            {
                System.out.print(" ");
            }
            
            for(int y=3;y<=x;y++)
            {
                System.out.print(y);
            }
            
            for(int y=(x-1);y>=3;y--)
            {
                System.out.print(y);
            }
            System.out.println();
        }
        
        for(int x=6;x>=3;x--)
        {
            for(int y=x;y<=6;y++)
            {
                System.out.print(" ");
            }
            
            for(int y=3;y<=x;y++)
            {
                System.out.print(y);
            }
            
            for(int y=x-1;y>=3;y--)
            {
                System.out.print(y);
            }
            System.out.println();
        }
    }
}