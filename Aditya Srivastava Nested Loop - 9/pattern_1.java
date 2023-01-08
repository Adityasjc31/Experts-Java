class pattern_1
{
    public static void main()
    {
        int p=1;
        for(int x=1;x<=4;x++)
        {   
            for(int y=1;y<=x;y++)
            {
                System.out.print(p++);
            }
            System.out.println();
        }
    }
}