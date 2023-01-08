class Pattern_9
{
    public static void main()
    {
        for(int x=5;x<=9;x++)
        {
            for(int y=x;y<=8;y++)
            {
                System.out.print(" ");
            }
            
            for(int y=x;y>=5;y--)
            {
                System.out.print(y);
            }
            
            for(int y=6;y<=x;y++)
            {
                System.out.print(y);
            }
            System.out.println();
        }
    }
}