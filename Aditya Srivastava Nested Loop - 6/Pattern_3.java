class Pattern_3
{
    public static void main()
    {
        for(int x=5;x>=1;x--)
        {
            for(int y=2;y<=x;y++)
            {
                System.out.print(" ");
            }
            
            for(int y=5;y>=x;y--)
            {
                System.out.print(y);
            }
            
            for(int y=x+1;y<=5;y++)
            {
                System.out.print(y);
            }
            System.out.println();
        }
        
        for(int x=2;x<=5;x++)
        {
            for(int y=2;y<=x;y++)
            {
                System.out.print(" ");
            }
            for(int y=5;y>=x;y--)
            {
                System.out.print(y);
            }
            for(int y=x+1;y<=5;y++)
            {
                System.out.print(y);
            }
            System.out.println();
        }
    }
}