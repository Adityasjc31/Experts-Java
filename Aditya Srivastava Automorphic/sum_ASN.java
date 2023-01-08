import java.util.*;
class sum_ASN
{
    public static void main(String args [])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n");int n=sc.nextInt();
        double sum=0;
        for(int x=1;x<=n;x++)
        {
            if(x%2==0)
            {
                sum=1.0/x-sum;
            }
            else
            {
                sum=1.0/x+sum;
            }
        }
        System.out.println("Sum="+sum);
    }
}