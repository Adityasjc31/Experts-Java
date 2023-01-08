package Last;

class Pattern_1
{
    public static void main()
    {
        for(int x=1;x<=5;x++)
        {
            for(int y=1;y<=5;y++)
            {
                System.out.print(x<y ? x : y);
            }
            System.out.println();
        }
    }
}