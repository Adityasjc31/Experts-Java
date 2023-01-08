import java.util.*;
class numbers
{
    public static void main(String args [])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter First Number");
        int a=sc.nextInt();
        System.out.println("Enter Second Number");
        int b=sc.nextInt();
        System.out.println("Enter Thrid Number");
        int l=sc.nextInt();
        if(a==b&&b==l)
        {
            System.out.println("These are equal.");
        }
        else
        {
            System.out.println("These are not equal.");
        }
    }
}