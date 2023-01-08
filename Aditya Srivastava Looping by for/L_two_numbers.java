import java.util.*;
class L_two_numbers
{
    public static void main(String args [])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter First Number");
        int a=sc.nextInt();
        System.out.println("Enter Second Number");
        int b=sc.nextInt();
        int s=a<b?a:b;
        int bi=a>b?a:b;
        for(int x=s;x<=bi;x++)
        {
            System.out.println(x);
        }
    }
}