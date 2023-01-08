class Pattern_Q
{
    public static void main(String args [])
    {
        for(int x=1;x<=7;x++)
        {
            for(int y=1;y<=5;y++)
            {
                if(x>=2&&x<=6&&(y==1 || y==5) || y>=2&&y<=4&&(x==1 || x==7) || x-y==2&&y>=3)
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