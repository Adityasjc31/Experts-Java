import java.util.*;
class ASMD
{
    public static void main(String args [])
    {
        Scanner sc=new Scanner(System.in);
        char n;
        do
        {
            System.out.println("Enter 1st Number");int a=sc.nextInt();
            System.out.println("Enter 2nd Number");int b=sc.nextInt();
            System.out.println("Enter operator");String nikalo = sc.nextLine();
            n=sc.next().charAt(0);
            switch(n)
            {
                case '+':
                System.out.println(a+"+"+b+"="+(a+b));
                break;
                case '-':
                System.out.println(a+"-"+b+"="+(a-b));
                break;
                case '*':case 'X':case 'x':
                System.out.println(a+""+n+""+b+"="+(a*b));
                break;
                case '/':
                System.out.println(a+"/"+b+"="+(a/b));
                break;
                case 'Y':case 'y':
                break;
                default :
                System.out.println("Wrong Choice");
            }
            System.out.println("More ? (y/n)");
            n=sc.next().charAt(0);
        }while(n=='y' || n=='Y');
    }
}