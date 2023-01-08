class Pattern_5
{
    public static void main()
    {
        for(int x=5,s=-1;x>=1;x--,s=s+2)
        {
            for(int y=1;y<=x;y++)
            {
                System.out.print((char)(y+64));
            }
               
            for(int y=1;y<=s;y++)
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