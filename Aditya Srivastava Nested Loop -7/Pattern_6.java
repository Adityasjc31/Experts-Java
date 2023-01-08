class Pattern_6
{
    public static void main()
    {
        for(int x=1;x<=5;x++)
        {
            for(int y=x;y<=4;y++)
            {
                System.out.print(" ");
            }
            
            for(int y=1;y<=x;y++)
            {
                System.out.print((char)(x+64));
            }
            System.out.println();
        }
    }
}