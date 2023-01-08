class Pattern_S
{
    public static void main()
    {
        for(int x=1;x<=7;x++)
        {
            for(int y=1;y<=5;y++)
            {
                if((x==2 || x==3 || x==6)&&y==1 || (y==3||y==2||y==4)&&(x==1 || x==4 || x==7) || y==5&&x==2 || (x==5||x==6)&&y==5)
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