class Pattern_2
{
    public static void main()
    {
        int p=10;
        for(int x=1;x<=5;x++)
        {   
            for(int y=1;y<=x;y++)
            {
                System.out.print(p++ +" ");
            }
            System.out.println();
        }
    }
}