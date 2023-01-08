class Pattern_4
{
    public static void main()
    {
        for(int x=1;x<=7;x++)
        {
            for(int y=1;y<=7;y++)
            {
                if(x==1 || x==7 || y==4)
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