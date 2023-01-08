import java.util.*;
class if_Else
{
    public static void main(String args [])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter First Number");
        int a=sc.nextInt();
        System.out.println("Enter second Number");
        int b=sc.nextInt();
        System.out.println("Enter Third Number");
        int c=sc.nextInt();
        if(a>b&&b>c)
        {
            System.out.println(a+">"+b+">"+c);
        }
        else if(a>c && a>c)
        {
            System.out.println(a+">"+c+">"+b);
        }
        else if(b>a && b>c)
        {
            System.out.println(b+">"+a+">"+c);
        }
       else if(b>a && a>c)
        {
            System.out.println(b+">"+c+">"+a);
        }
        else if(c>a&&a>b)
        {
            System.out.println(c+">"+a+">"+b);
        }
        
        else if(c>b && b>a)
        {
            System.out.println(c+">"+b+">"+c);
        }
    }
}