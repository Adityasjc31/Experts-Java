import java.util.*;
public class Fascinating
{
    public static void main(final String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("m = ");
        final int m = sc.nextInt();
        System.out.print("n = ");
        final int n = sc.nextInt();
        if (n < 99 || n > 10000 || m < 99 || n > 10000 || m > n) 
        {
            System.out.println("INVALID INPUT");
            return;
        }
        int c = 0;
        for (int x = m; x <= n; ++x) 
        {
            if (fasin(x)) 
            {
                c++;
                System.out.print(x + "\t");
            }
        }
        System.out.println();
        if (c == 0)
        {
            System.out.println("NIL");
        }
        System.out.println("FREQUENCY OF FASCINATING NUMBER : " + c);
    }

    public static boolean isFascinating(final int n) 
    {
        int n2 = n * 2;
        int n3 = n * 3;
        long number = Long.parseLong(n + "" + n2 + "" + n3);
        boolean flag = true;
        int x;
        for(x=1;x<=9;x++)
        {
            int c=0;
            for(long y = number;y!=0;y/=10)
            {
                int digit = (int)y%10;
                if(digit == x)
                {
                    c++;
                }
            }
            if(c>1 || c==0)
            {
                flag = false;
                break;
            }
        }
        return flag;
    }
    
    public static boolean fasin(int n)
    {
        int n1=n*1;
        int n2=n*2;
        int n3=n*3;
        String s1=n1+"";
        String s2=n2+"";
        String s3=n3+"";
        String str=s1.concat(s2);
        String str1=str.concat(s3);
        long k=Long.parseLong(str1);

        for(int x=1;x<=9;x++)
        {
            int c=0;
            for(long y=k;y!=0;y/=10)
            {
                long d=y%10;
                if(d==x)
                {
                    c++;
                }
            }

            if(c>1 || c==0)
            {
                return false;
            }
        }
        return true;
    }
}