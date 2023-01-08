class Pattern_9
{
    public static void main()
    {
        for(int x=5;x>=1;x--)
        {
            for(int y=x;y>1;y--)
            {
                System.out.print(" ");
            }
            
            for(int y=5;y>=x;y--)
            {
                System.out.print(x);
            }
            System.out.println();
        }
    }
}