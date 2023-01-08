import java.util.*;
class LCM_HCF_Me
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1st Number");int n1=sc.nextInt();
        System.out.println("Enter 2nd Number");int n2=sc.nextInt();
        int d;int nc=n1;int nu=n2;
        while(true)
        {
            d=nu%nc;
            if(d==0)
            {  
                System.out.println("HCF="+nc);break;
            }
            nc=d;nu=nc;
        }
        System.out.println("LCM="+(n1*n2)/nc);
    }
}