class Pattern_2_360
{
    public static void main(String args [])
    {
        for(int x=1;x<=9;x++)
        {
            for(int y=1;y<=5;y++)
            {
                if(x-y<=0 || x+y>=10)
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