class Pattern_J
{
    public static void main(String args [])
    {
        for(int x=1;x<=7;x++)
        {
            for(int y=1;y<=5;y++)
            {
                if(x==1 || y==4&&x<=6 || (x==5 || x==6)&&y==1 || x==7&&(y==2 || y==3))
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