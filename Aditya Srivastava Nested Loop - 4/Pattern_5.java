class Pattern_5
{
    public static void main()
    {
        for(int x=5;x>=1;x--)
        {
            for(int y=x;y<5;y++)
            {
                System.out.print(" ");
            }
               
            for(int y=1;y<=x;y++)
            {
                System.out.print(y);
            }
            System.out.println();
        }
    }
}