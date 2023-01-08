import java.util.Scanner;
class Operator
{
    public static void main(String args [])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter First Number");
        int a=sc.nextInt();
        System.out.println("Enter Second Number");
        int b=sc.nextInt();
        System.out.println("Enter operator");
        char c=sc.next().charAt(0);
        if(c=='+')
        {
            System.out.println(a+"+"+b+"="+(a+b));
        }
        else if(c=='-')
        {
            System.out.println(a+"-"+b+"="+(a-b));
        }
        else if(c=='x'||c=='X'||c=='*')
        {
            System.out.println(""+a+c+b+"="+(a*b));
        }
        else if(c=='/')
        {
            System.out.println(a+"/"+b+"="+(a/(double)b));
        }
        else
        {
            System.out.println("Invalid Operator");
        }
    }
}