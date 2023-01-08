class Pattern_2
{
    public static void main(String args [])
    {
        for(int x=1;x<=5;x++)
        {
            for(int y=1;y<=9;y++)
            {
                if(x+y>=10 || x-y>=0)
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