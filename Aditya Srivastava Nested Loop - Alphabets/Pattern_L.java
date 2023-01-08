class Pattern_L
{
    public static void main()
    {
        for(int x=1;x<=7;x++)
        {
            for(int y=1;y<=5;y++)
            {
                if(y==1 || x==7)
                {
                    System.out.print("* ");
                }
                else
                {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}