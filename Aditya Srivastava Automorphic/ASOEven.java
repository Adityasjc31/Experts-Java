import java.util.*;
class ASOEven
{
    public static void main(String args [])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n");int n=sc.nextInt();
        double sum=0;
        for(int x=2;x<=n;x+=2)
        {
            if(x%4!=0)
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