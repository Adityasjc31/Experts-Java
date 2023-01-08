import java.util.*;
class Sum
{
    public static void main(String args [])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number");
        int n=sc.nextInt(),sum=0;
        for(int x=n;x!=0;x=x/10)
        {
            int d=x%10;sum+=d;
        }
        System.out.println("Sum of digits = "+sum);
    }
}