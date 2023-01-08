class Pattern_2
{
    public static void main()
    {
        for(char x='E';x>='A';x--)
        {   
            for(char y='E';y>=x;y--)
            {
                System.out.print(y);
            }
            System.out.println();
        }
    }
}