import java.util.*;
class Unique
{
    public static int count(int n,int d)
    {
        int c=0;
        while(n!=0)
        {
            int di=n%10;
            if(di==d)
            {
                c++;
            }
            n/=10;
        }
        return c;
    }
    
    public static boolean Unique(int n)
    {
        for(int x=0;x<=9;x++)
        {
            if(count(n,x) > 1)
            {
                return false;
            }
        }
        return true;
    }
    
    public static void main(String args [])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number");int a=sc.nextInt();
        System.out.println("Enter 2nd number");int b=sc.nextInt();
        int c=0;
        for(int x=a;x<=b;x++)
        {
            if(Unique(x))
            {
                if(c>0)
                {
                    System.out.print(",");
                }
                if(c%8==0)
                {
                    System.out.println();
                }
                System.out.print(x);
                c++;
            }
        }
        System.out.println(".\n"+c+" Unique Numbers");
    }
}