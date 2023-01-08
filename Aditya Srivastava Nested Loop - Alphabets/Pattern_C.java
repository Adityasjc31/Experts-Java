class Pattern_C
{
    public static void main()
    {
        for(int x=1;x<=7;x++)
        {
            for(int y=1;y<=5;y++)
            {
                if((x!=1 && x!=7)&&y==1 || y>=2&&y<=4&&(x==1||x==7) || y==5 &&(x==2||x==6 ))
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