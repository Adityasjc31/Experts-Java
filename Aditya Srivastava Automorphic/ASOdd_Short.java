import java.util.*;
class ASOdd_Short
{
    public static void main(String args [])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value of n");int n=sc.nextInt();double sum=0;int s=1;
        for(int x=1;x<=n;x+=2)
        {
            sum=sum+(1.0/x)*1;
            s=s*(-1);
        }
        System.out.println("Sum="+sum);
    }
}