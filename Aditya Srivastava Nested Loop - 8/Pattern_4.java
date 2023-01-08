class Pattern_4
{
    public static void main()
    {
        for(int x=1;x<=5;x++)
        {
            for(int y=x;y>=1;y--)
            {
                System.out.print(y%2);
            }
            System.out.println();
        }
    }
}