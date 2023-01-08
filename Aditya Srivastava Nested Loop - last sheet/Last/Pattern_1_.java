package Last;

class Pattern_1_
{
    public static void main()
    {
        for(int x=1;x<=5;x++)
        {
            for(int y=1;y<=x;y++)
            {
                System.out.print(y);
            }
            for(int y=x;y<=4;y++)
            {
                System.out.print(x);
            }
            System.out.println();  
        }
    }
}