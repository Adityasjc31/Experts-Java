class Q5 extends S
{
    public static void main(String args [])
    {
        System.out.println("Menu\n'a' - Pattern 1\n'b' - Pattern \nEnter your Choice");
        char n=Character.toLowerCase(sc.next().charAt(0));
        switch(n)
        {
            case 'a':
            for(int x=1 ;x<=5 ;x++)
            {
                for(int y=1;y<=x;y++)
                {
                    if(y%2==1)
                    System.out.print('*');
                    else
                    System.out.print('#');
                }
                System.out.println();
            }
            break;
            
            case 'b':
            for(int x=1;x<=5;x++)
            {
                for(int y=5;y>=x;y--)
                {
                    System.out.print(y);
                }
                System.out.println();
            }
            break;
            
            default:
            System.out.println("Wrong Choice");
        }
    }
}