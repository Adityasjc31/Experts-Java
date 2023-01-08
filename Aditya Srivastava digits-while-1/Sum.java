import java.util.*;
class Sum
{
    public static void main(String args [])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),sum=0;
        while(n!=0)
        {
            int d=n%10;sum+=d;n=n/10;
        }
        System.out.println("Sum of digits = "+sum);
    }
}