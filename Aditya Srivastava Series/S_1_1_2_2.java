import java.util.*;
class S_1_1_2_2
{
    public static void main(String args [])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n");int n=sc.nextInt();double sum=0;
        for(int x=1;x<=n;x++)
        {
            sum=sum+(1.0/(x*x));
        }
        System.out.println("Sum="+sum);
    }
}