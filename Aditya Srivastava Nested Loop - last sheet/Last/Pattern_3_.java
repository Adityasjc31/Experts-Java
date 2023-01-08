package Last;

class Pattern_3_
{
    public static void main()
    {
        for(int x=5;x>=1;x--)
        {
            for(int y=1;y<x;y++)
            {
                System.out.print(y);
            }
            for(int y=5;y>=x;y--)
            {
                System.out.print(x);
            }
            System.out.println();
        }
    }
}