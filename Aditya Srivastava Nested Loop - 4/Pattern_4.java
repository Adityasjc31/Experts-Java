class Pattern_4
{
    public static void main()
    {
        for(int x=7;x>=3;x--)
        {
            for(int y=x;y>3;y--)
            {
                System.out.print(" ");
            }
            
            for(int y=x;y<=7;y++)
            {
                System.out.print(y);
            }
            System.out.println();
        }
    }
}