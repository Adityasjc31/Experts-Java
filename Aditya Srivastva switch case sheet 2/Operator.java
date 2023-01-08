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
        System.out.println("'+'\t-\tTo Add");
        System.out.println("'-'\t-\tTo Subtract");
        System.out.println("'*'\t-\tTo Multiply");
        System.out.println("'/'\t-\tTo Divide");
        System.out.println("Enter Your Choice");
        char c=sc.next().charAt(0);
        switch(c)
        {
            case '+':
            System.out.println(a+"+"+b+"="+(a+b));
            break;
            case '-':
            System.out.println(a+"-"+b+"="+(a-b));
            case 'X':case 'x':case '*':
            System.out.println(""+a+c+b+"="+(a*b));
            break;
            case '/':
            System.out.println(a+"/"+b+"="+(a/(double)b));
            break;
            default:
            System.out.println("Invalid Operator");
        }
    }
}