class pattern_7
{
    public static void main()
    {
        for(int x=6;x<=9;x++)
        {
            for(int y=x;y<9;y++)
            {
                System.out.print(" ");
            }
            
            for(int y=6;y<=x;y++)
            {
                System.out.print(x);
            }
            System.out.println();
        }
    }
}