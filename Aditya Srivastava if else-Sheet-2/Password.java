import java.util.*;
class Password
{
    public static void main(String args [])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Password");
        String l=sc.nextLine();
        if(l.equals("abC"))
        {
            System.out.println("Enter First Number");
            int a=sc.nextInt();
            System.out.println("Enter Second Number");
            int b=sc.nextInt();
            System.out.println("Sum="+(a+b));
        }
        else
        {
            System.out.println("Wrong Password");
        }
    }
}