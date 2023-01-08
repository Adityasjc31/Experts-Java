import java.util.*;
class S_1_3_5_n
{
    public static void main(String args [])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value of n");int n=sc.nextInt();double sum=0;
        for(int x=1;x<=n;x++)
        {
            sum=(1d/x)+sum;
        }
        System.out.println("Sum="+sum);
    }
}