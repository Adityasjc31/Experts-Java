class Pattern_4
{
    public static void main()
    {
        for(int x=5;x>=1;x--)
        {
            for(int y=2;y<=x;y++)
            {
                System.out.print(" ");
            }
            for(int y=x;y<=5;y++)
            {
                System.out.print((char)(y+64));
            }
            System.out.println();
        }
    }
}