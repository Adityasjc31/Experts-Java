import java.util.*;
class palindrome_perfect
{
    public static void main(String args [])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number");int n=sc.nextInt();
        System.out.println("Menu\n1 - To Check palindrome\n2 - To Check Perfect");
        int c=sc.nextInt();
        switch(c)
        {
            case 1 :
            int r=0;
            for(int x=n ; x!=0 ; x=x/10)
            {
                r=r*10+(x%10);
            }
            if(r==n)
                System.out.println("Palindrome");
            else
                System.out.println("Not Palindrome");
            break;
            case 2 :
            int s=0;
            for(int x=1;x<=n/2;x++)
            {
                if(n%x==0)
                {
                    s=s+x;
                }
            }
            if(s==n)
            {
                System.out.println("Pefect");
            }
            else
            {
                System.out.println("Not a Perfect");
            }
            break;
            default :
            System.out.println("Wrong Choice");
        }
    }
}