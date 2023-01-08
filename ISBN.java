import java.util.*;
public class ISBN
{
    public static long ISBNValue(String t)
    {
        if(t.charAt(9) == 'X' || t.charAt(9)=='x')
        {
            t = t + 10;
        }
        long n = new Long(t);
        long val = 0;
        for(long x=1;x<=10;x++)
        {
            long d = n%10;
            long value = x*d;
            val += value;
            n=n/10;
        }
        return val;
    }
    
    public static boolean isValidISBN(String n)
    {
        if(ISBNValue(n)%11 == 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter ISBN");
        String n = sc.next();
        if(n.length() == 10)
        {
            System.out.println("SUM = "+ISBNValue(n));
            if(isValidISBN(n))
            {
                System.out.println("LEAVES NO REMAINDER – VALID ISBN CODE");
            }
            else
            {
                System.out.println("LEAVES REMAINDER – INVALID ISBN CODE");
            }
        }
        else
        {
            System.out.println("INVALID INPUT");
        }
    }
}