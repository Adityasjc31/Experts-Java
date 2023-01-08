import java.util.*;
class AdOdd_Anvar
{
    public static void main(String args [])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n");int n=sc.nextInt();
        double sum=0;
        for(int x=1,y=1;x<=n;x+=2,y++)
        {
            if(y%2==0)
            {
                sum=(1.0/x)-sum;
            }
            else
            {
                sum=(1.0/x)+sum;
            }
        }
        System.out.println("Sum="+sum);
    }
}