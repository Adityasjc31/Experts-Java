import java.util.*;
class Q8
{
    public static void main(String args [])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Menu\n1 - Pattern 1\n2 - Pattern 2\nEnter your choice");
        int n=sc.nextInt();
        switch(n)
        {
            case 1 :
            for(char x='E';x>='A';x++)
            {
                for(char y='A';y<=x;y++)
                {
                    System.out.print(y);
                }
                System.out.println();
            }
            break;
            
            case 2:
            String s="BLUE";
            for(int a=0;a<5;a++)
            {
                System.out.println(s.substring(0,a));
            }
            break;
            
            default:
            System.out.println("Wrong Choice");
        }
    }
}