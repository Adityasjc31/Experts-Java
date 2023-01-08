import java.util.*;
class  Armstrong
{
    public static void main(String args [])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt(),s=0;
        while(n!=0)
        {
            int d=n%10;
            s=(d*d*d)+s;
            n=n/10;
        }
        if(n==s)
        {
            System.out.println("Armstrong");
        }
        else
        {
            System.out.println("Not a Armstrong");
        }
    }
}