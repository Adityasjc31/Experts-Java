class Pattern_5
{
    public static void main()
    {
        for(int x=5;x>=1;x--)
        {
            for(int y=1;y<=x;y++)
            {
                System.out.print((char)(y+64));
            }
               
            for(int y=1;y<=9-x*2;y++)
            {
                System.out.print(" ");
            }
            
            for(int y=(x==5 ? 4:x);y>=1;y--)
            {
                System.out.print((char)(y+64));
            }
            System.out.println();
        }
    }
}