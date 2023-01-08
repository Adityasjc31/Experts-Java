class Pattern_5
{
    public static void main()
    {
        int p=1;
        for(int x=1;x<=5;x++)
        {
            for(int y=x;y<=4;y++)
            {
                System.out.print(" ");
            }
               
            for(int y=1;y<=x;y++)
            {
                System.out.print((char)(p+96));
                p++;
            }
            System.out.println();
        }
    }
}