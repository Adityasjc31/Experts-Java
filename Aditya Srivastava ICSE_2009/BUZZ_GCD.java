import java.util.*;
class BUZZ_GCD
{
    public static void main(String args [])
    {
        Scanner sc = new Scanner(System.in);int n=0;
        System.out.println("1 - BUZZ Number\n2 - GCD\nEnter your choice");int ch = sc.nextInt();
        if(ch==1){System.out.println("Enter any number");n=sc.nextInt();}

        switch(ch)
        {
            case 1:
            if(n%7==0 && n%10==7)
            {
                System.out.println("BUZZ Number");
            }
            else
            {
                System.out.println("Not a BUZZ Number");
            }
            break;

            case 2:
            System.out.println("Enter number 1 : "); int a=sc.nextInt();
            System.out.println("Enter number 2 : "); int b=sc.nextInt();
            int s=a<b?a:b;int h=0;
            for(int x=1;x<=s;x++)
            {
                if(a%x==0 && b%x==0)
                {
                    h=x;
                }
            }
            System.out.println("GCD = "+h);
            break;
            default :
            System.out.println("Wrong Choice");
        }
    }
}