class Pattern_2
{
    public static void main(String args [])
    {
        for(int x=1;x<=5;x++)
        {
            for(int y=1;y<=x;y++)
            {
                System.out.print(y);
            }

            for(int y=1;y<=9-x*2;y++)
            {
                System.out.print(" ");
            }

            for(int y=x;y>=1;y--)
            {
                if(y!=5)
                {
                    System.out.print(y);
                }
            }
            System.out.println();
        }
    }
}