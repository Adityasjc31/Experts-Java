class pattern_1
{
    public static void main()
    {
        for(int x=1;x<=5;x++)
        {   
            for(int y=1;y<=x;y++)
            {
                System.out.print(y%2);
            }
            System.out.println();
        }
    }
}