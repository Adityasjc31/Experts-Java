class Pattern_I
{
    public static void main(String args [])
    {
        for(int x=1;x<=7;x++)
        {
            for(int y=1;y<=5;y++)
            {
                if(x==1 || x==7 || y==3)
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