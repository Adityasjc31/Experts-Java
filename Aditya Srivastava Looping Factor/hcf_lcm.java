import java.util.*;
class hcf_lcm
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1st Number");int a=sc.nextInt();
        System.out.println("Enter 2nd Number");int b=sc.nextInt();
        for(int x=a<b?a:b;x>=1;x--)
        {
            if(a%x==0 && b%x==0)
            {
                System.out.println("HCF="+x);
                System.out.println("LCM="+(a*b)/x);
                break;
            }
        }
    }
}