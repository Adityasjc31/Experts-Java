import java.util.*;
class Switch
{
    public static void main(String args [])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Menu\n1 - For Sum of Series\n2 - For Pattern");
        System.out.println("Enter your choice");
        int c=sc.nextInt();
        switch(c)
        {
            case 1:
            System.out.println("Enter value of a");int a=sc.nextInt();
            System.out.println("Enter value of n");int n=sc.nextInt();
            double s=0.0;
            for(int x=2;x<=n;x+=3)
            {
                s=s+(a/x);
            }
            System.out.println("Sum = "+s);
            break;
            case 2:
            String s1 = "BLUEJ";
            for(int x=0;x<=s1.length();x++)
            {
                System.out.println(s1.substring(0,x));
            }
            break;
            default:
            System.out.println("Wrong Choice");
        }
    }
}