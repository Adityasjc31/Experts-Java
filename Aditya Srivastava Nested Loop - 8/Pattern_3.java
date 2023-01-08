class Pattern_3
{
    public static void main()
    {
        int p=1;
        for(int x=1;x<=5;x++)
        {   
            for(int y=1;y<=x;y++)
            {
                System.out.print(p++%2);
            }
            System.out.println();
        }
    }
}