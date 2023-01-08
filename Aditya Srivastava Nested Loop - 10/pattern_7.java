class pattern_7
{
    public static void main()
    {
        for(int x=1;x<=9;x+=2)
        {
            for(int y=x;y<=7;y+=2)
            {
                System.out.print(" ");
            }
            
            for(int y=1;y<=x;y+=2)
            {
                System.out.print((char)(y+64));
            }
            System.out.println();
        }
    }
}