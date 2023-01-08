import java.util.*;
class LCM_HCF_Broad
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1st Number");int a=sc.nextInt();
        System.out.println("Enter 2nd Number");int b=sc.nextInt();
        int s=a<b?a:b;
        int bi=a>b?a:b;
        while(bi%s!=0)
        {
            int r=bi%s;
            bi=s;
            s=r;
        }
        System.out.println("HCF="+s+"\nLCM="+(a*b)/s);
    }
}