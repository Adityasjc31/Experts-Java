class Pattern_6
{
    public static void main()
    {
        for(int x=1;x<=5;x++)
        {
            for(int y=5;y>x;y--)
            {
                System.out.print(" ");
            }
            
            for(int y=1;y<=x;y++)
            {
                System.out.print(x);
            }
            System.out.println();
        }
    }
}