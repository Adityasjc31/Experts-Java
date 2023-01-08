class pattern_1
{
    public static void main()
    {
        for(int x=1;x<=5;x++)
        {
            for(int y=1;y<=x;y++)
            {
                System.out.print(y);
            }
            
            for(int y=x;y<=4;y++)
            {
                System.out.print("  ");
            }
            
            for(int y=x;y>=1;y--)
            {
                System.out.print(y);
            }
            System.out.println();
        }
    }
}