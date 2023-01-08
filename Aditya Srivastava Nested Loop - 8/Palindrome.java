import java.util.*;
class Palindrome
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter smaller number");int s=sc.nextInt();
        System.out.println("Enter bigger number");int b=sc.nextInt();
        boolean bi=false;
        System.out.println("Palindrome Numbers are");
        for(int x=s;x<=b;x++)
        {
            int so=0;
            for(int y=x;y!=0;y=y/10)
            {
                int d=y%10;
                so=(so*10)+d;
            }
            if(x==so)
            {
                System.out.println(x);
                bi=true;
            }
        }
        if(bi == false)
        {
            System.out.println("Not Found");
        }
    }
}