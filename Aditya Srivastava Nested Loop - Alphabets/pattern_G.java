class pattern_G
{
    public static void main()
    {
        for(int x=1;x<=7;x++)
        {
            for(int y=1;y<=5;y++)
            {
                if((x!=1 && x!=7)&&y==1 || (x==1 || x==7)&&y>=2&&y<=4 || y==5&&(x==5 || x==6) || x==4&&y>=3 && y<=5)
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