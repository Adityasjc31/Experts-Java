import java.util.*;
class  Armstrong
{
    public static void main(String args [])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt(),s=0;
        for(int x=n;x!=0;x=x/10)
        {
            int d=x%10;
            s=(d*d*d)+s;
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