import java.util.*;
class Armstrong
{
    public static boolean isArmstrong(int n)
    {
        int s=0;
        for(int x=n ; x!=0 ; x/=10)
        {
            int d=x%10;
            s=s+d*d*d;
        }
        return s==n;
    }
    
    public static void main(String args [])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number");
        int n=sc.nextInt();
        if(isArmstrong(n))
        {
            System.out.println(n);
        }
        else
        {
            int d=1;
            boolean f=false;
            while(!f)
            {
                if(isArmstrong(n-d))
                {
                    System.out.println(n-d);
                    f=true;
                }
                
                if(isArmstrong(n+d))
                {
                    System.out.println(n+d);
                    f=true;
                }
                d++;
            }
        }
    }
}