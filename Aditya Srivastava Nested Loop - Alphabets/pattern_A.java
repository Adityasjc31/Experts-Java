class pattern_A
{
    public static void main()
    {
        for(int x=1;x<=7;x++)
        {
            for(int y=1;y<=5;y++)
            {
                if((y==1 || y==5)&&x>=2 || x==1 && y>=2 && y<=4 || x==4 )
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