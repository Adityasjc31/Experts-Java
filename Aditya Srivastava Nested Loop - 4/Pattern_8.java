class Pattern_8
{
    public static void main()
    {
        for(int x=9;x>=5;x--)
        {
            for(int y=6;y<=x;y++)
            {
                System.out.print(" ");
            }
            
            for(int y=9;y>=x;y--)
            {
                System.out.print(x);
            }
            System.out.println();
        }
    }
}