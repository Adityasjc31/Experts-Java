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
            
            for(int y=x;y<=9;y++)
            {
                System.out.print(y);
            }
            
            for(int y=8;y>=x;y--)
            {
                System.out.print(y);
            }
            System.out.println();
        }
    }
}