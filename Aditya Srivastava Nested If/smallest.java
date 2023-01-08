import java.util.*;
class smallest
{
    public static void main(String args [])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter First Number");
        int a=sc.nextInt();
        System.out.println("Enter second Number");
        int b=sc.nextInt();
        System.out.println("Enter Thrid Number");
        int c=sc.nextInt();
        if(a<b)
        {
            if(a<c)
            {
                System.out.println("Smallest="+a);
            }
            else
            {
                System.out.println("Smallest="+c);
            }
        }
        else
        {
            if(b<c)
            {
                System.out.println("Smallest="+b);
            }
            else
            {
                System.out.println("Smallest="+c);
            }
        }
    }
}
