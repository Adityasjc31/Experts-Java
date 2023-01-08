class Pattern_3
{
    public static void main()
    {
        for(int x=9;x>=5;x--)
        {
            for(int y=5;y<x;y++)
            {
                System.out.print(" ");
            }
            
            for(int y=9;y>=x;y--)
            {
                System.out.print(y);
            }
            System.out.println();
        }
    }
}