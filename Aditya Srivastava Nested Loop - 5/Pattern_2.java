class Pattern_2
{
    public static void main()
    {
        for(int x=4;x<=8;x++)
        {
            for(int y=x;y>=5;y--)
            {
                System.out.print(" ");
            }
            
            for(int y=x;y<=8;y++)
            {
                System.out.print(x);
            }
            System.out.println();
        }
    }
}