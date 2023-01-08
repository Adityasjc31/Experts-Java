class Pattern_6
{
    public static void main()
    {
        for(int x=1;x<=5;x++)
        {
            for(int y=x;y<=5;y++)
            {
                System.out.print((char)(y+64));
            }
            
            for(int y=1;y<=x*2-3;y++)
            {
                System.out.print(" ");
            }
            
            for(int y=(x==1 ? 4:5);y>=x;y--)
            {
                System.out.print((char)(64+y));
            }
            System.out.println();
           
        }
    }
}