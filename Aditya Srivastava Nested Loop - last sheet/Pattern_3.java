class Pattern_3
{
    public static void main()
    {
        for(int x=1;x<=5;x++)
        {
            for(int y=1;y<=5;y++)
            {
                if(x==y)
                {
                    System.out.print("1 ");
                }
                else
                {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
}