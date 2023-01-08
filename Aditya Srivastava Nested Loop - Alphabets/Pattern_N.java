class Pattern_N
{
    public static void main(String args [])
    {
        for(int x=1;x<=7;x++)
        {
            for(int y=1;y<=5;y++)
            {
                if(y==1 || y==5 || x-y==1)
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