import java.util.*;
class Desending
{
    public static void main(String args [])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number");
        int a=sc.nextInt();
        System.out.println("Enter Second Number");
        int b=sc.nextInt();
        System.out.println("Enter Thrid Number");
        int c=sc.nextInt();
        if(b>c)
        {
            if(c>a)
            {
                System.out.println(b+">"+c+">"+a);
            }
            else
            {
                if(a>b)
                {
                    System.out.println(a+">"+b+">"+c);
                }
                else
                {
                    System.out.println(b+">"+a+">"+c);
                }
            }
        }
        else
        {
            if(b>a)
            {
                System.out.println(c+">"+b+">"+a);
            }
            else
            {
                if(a>c)
                {
                    System.out.println(a+">"+c+">"+b);
                }
                else
                {
                    System.out.println(c+">"+a+">"+b);
                }
            }
        }
    }
}