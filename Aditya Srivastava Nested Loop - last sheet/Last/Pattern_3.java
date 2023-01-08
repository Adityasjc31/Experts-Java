package Last;

class Pattern_3
{
    public static void main()
    {
        for(int x=5;x>=1;x--)
        {
            for(int y=1;y<=5;y++)
            {
                System.out.print(x<y ? x : y);
            }
            System.out.println();
        }
    }
}