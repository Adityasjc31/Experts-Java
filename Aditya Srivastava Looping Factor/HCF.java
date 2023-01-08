import java.util.*;
class HCF
{
    public static void main(String args [])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1st Number");int a=sc.nextInt();
        System.out.println("Enter 2nd Number");int b=sc.nextInt();
        int s=a<b?a:b;int h=0;
        for(int x=1;x<=s;x++)
        {
            if(a%x==0 && b%x==0)
            {
                h=x;
            }
        }
        System.out.println("HCF="+h);
    }
}