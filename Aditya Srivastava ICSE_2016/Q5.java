class Q5 extends A
{
    public static void main(String args [])
    {
        System.out.println("Menu\n1 - To see Floyd's Triangle\n2 - To see a pattern\nEnter your Choice");
        int n=sc.nextInt();
        switch(n)
        {
            case 1:
            int a=1;
            for(int x=1;x<=5;x++)
            {
                for(int y=1;y<=x;y++)
                {
                    System.out.print(a+++" ");
                }
                System.out.println();
            }
            break;
            
            case 2:
            String s="ICSE";
            for(int x=0;x<s.length();x++)
            {
                System.out.println(s.substring(0,x+1));
            }
            break;
            
            default :
            System.out.println("Wrong Choice");
        }
    }
}