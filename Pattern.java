class Pattern
{
    public static void main(String args[])
    {
        parslf();
        paself();
    }

    private static void paself()
    {
        for(int x=1,c=1,c1=2; x<=4 ;x++,c--,c1++)
        {
            char ch = 'A';
            for(int y=0;y<=x;y++)
            {
                System.out.print(ch++ + " ");
            }
            if(x!=4)
            {
                int t=x==3 ? 3 : c;
                for(int y=1;y<=(t==3 ? 1 : t+2);y++)
                {
                    System.out.print(y+" ");
                }
            }
            if(x<=2)
            {
                for(int y=x==1 ? 2 : 1;y>=1;y--)
                {
                    System.out.print(y+" ");
                }
            }
            char t=x==4 ? (char)(63+c1) : (char)(64+c1);
            for(char y=x==4 ? (char)(63+c1) : (char)(64+c1) ; y>='A';y--)
            {
                System.out.print(y+" ");
            }
            System.out.println();
        }
    }

    private static void parslf()
    {
        for(int x=5,z=0;x>=1;x--)
        {
            char h='A';
            for(int y=1;y<=x;y++)
            {
                System.out.print(h++ + " ");
            }
            for(int y=4,c=3;y>=x;y--,c=c-2)
            {
                System.out.print(y-c + " ");
            }
            for(int y=z;y>=1;y--)
            {
                System.out.print(y+ " ");
            }
            for(char y=(x>=5 ? (char)((63+x)) : (char)(64+x));y>='A';y--)
            {
                System.out.print(y+" ");
            }
            if(x<=4){z++;}else{z=0;}
            System.out.println();
        }
    }
}