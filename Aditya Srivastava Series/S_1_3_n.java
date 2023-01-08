import java.util.*;
class S_1_3_n
{
    public static void main(String args [])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n");int n=sc.nextInt(),sum=0;
        for(int x=1;x<=n;x+=2)
        {
            sum+=x;
        }
        System.out.println("Sum="+sum);
    }
}