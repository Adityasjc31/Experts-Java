import java.util.*;
class Q9
{
    public static void main(String args [])
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Menu\n1 - Series 1\n2 - Series 2\nEnter your Choice");
        int ch=sc.nextInt();
        switch(ch)
        {
            case 1:
            {
                System.out.println("Enter value of n");
                int n=sc.nextInt();
                for(int x=1;x<n;x++)
                {
                    System.out.print((x*x)-1+",");
                }
            }
            break;

            case 2:
            double s=0,a=0.5;
            for(int x=2;x<=20;x++)
            {
                s=s+((x*x)+1)/(x*x);
            }
            s=s+a;
            System.out.println("Sum = "+s);
            break;

            default :
            System.out.println("Wrong Choice");
        }
    }
}