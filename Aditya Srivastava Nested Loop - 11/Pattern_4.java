class Pattern_4
{
    public static void main()
    {
        for(int x=1;x<=5;x++)
        {
            for(int y=1;y<=x;y++)
            {
                System.out.print(x);
            }

            for(int y=1;y<=9-x*2;y++)
            {
                System.out.print(" ");
            }

            for(int y=x;y>=1;y--)
            {
                if(!(x==5 && y==5))
                {
                    System.out.print(x);
                }
            }
            System.out.println();
        }
    }
}