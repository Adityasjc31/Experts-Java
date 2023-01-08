class Pattern_6
{
    public static void main()
    {
        for(int x=9;x>=1;x=x-2)
        {
            for(int y=x;y<9;y=y+2)
            {
                System.out.print(" ");
            }
            
            for(int y=x;y>=1;y--)
            {
                System.out.print(y);
            }
            System.out.println();
        }
    }
}