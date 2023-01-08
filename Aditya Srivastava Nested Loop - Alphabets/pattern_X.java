class pattern_X
{
    public static void main()
    {
        for(int x=1;x<=7;x++)
        {
            for(int y=1;y<=5;y++)
            {
                if((y==1||y==5)&&(x<=2 || x>=6) || x-y==1 || y+x==7)
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