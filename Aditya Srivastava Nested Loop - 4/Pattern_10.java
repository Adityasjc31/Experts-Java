class Pattern_10
{
    public static void main()
    {
        for(int x=7;x>=3;x--)
        {
            for(int y=6;y>=x;y--)
            {
                System.out.print(" ");
            }
            
            for(int y=3;y<=x;y++)
            {
                System.out.print(x);
            }
            System.out.println();
        }
    }
}