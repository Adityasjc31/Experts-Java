import java.util.*;
class Sum_x_n
{
    public static void main(String args [])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n");int n=sc.nextInt();
        System.out.println("Enter the value of x");int x=sc.nextInt();
        double sum=0;
        for(int i=1;i<=n;i++)
        {
            sum=x/(double)i+sum
            ;
        }
        System.out.println("Sum="+sum);
    }
}