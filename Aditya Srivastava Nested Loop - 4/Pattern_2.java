class Pattern_2
{
    public static void main()
    {
        for(int x=3;x<=7;x++)
        {
            for(int y=x;y<7;y++)
            {
                System.out.print(" ");
            }
            
            for(int y=3;y<=x;y++)
            {
                System.out.print(y);
            }
            System.out.println();
        }
    }
}