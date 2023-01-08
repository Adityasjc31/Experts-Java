import java.util.*;
class Pattern
{
    public static void main(String args [])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of n ");int n=sc.nextInt();
        System.out.println("1 - Triangle\n2 - Inverted Triangle\nEnter the type of purchase");int ch = sc.nextInt();
        
        switch(ch)
        {
            case 1 :
            for(int x=1;x<=n;x++)
            {
                for(int y=1;y<=x;y++)
                {
                    System.out.print(x);
                }
                System.out.println();
            }
            break;
            case 2:
            for(int x=n;x>=1;x--)
            {
                for(int y=1;y<n;y++)
                {
                    System.out.print(x);
                }
                System.out.println();
            }
            break;
            default :
            System.out.println("Wrong Choice");
        }
    }
}