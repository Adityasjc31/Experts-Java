import java.util.*;
class HCF_LCM_Big_Small
{
    public static void main(String args [])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1st Number");int a=sc.nextInt();
        System.out.println("Enter 2nd Number");int b=sc.nextInt();
        int s=Math.min(a,b);int bi=Math.max(a,b);int l=bi;
        while(l%s!=0)
        {
            l=l+bi;
        }
        System.out.println("LCM="+l+"\nHCF="+(a*b)/l);
    }
}