import java.util.*;
class Q5
{
    public static void main(String args [])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an ISBN Number : ");
        long l =sc.nextLong();
        String s=Long.toString(l);
        if(s.length()==10)
        {
            long sum=0;
            for(long x=l,a=10;x!=0;x=x/10,a--)
            {
                long d=x%10;
                sum=sum+(d*a);
            }
            if(sum%11 == 0)
            {
                System.out.println("Legal ISBN");
            }
            else
            {
                System.out.println("lllegal ISBN");
            }
        }
        else
        {
            System.out.println("lllegal ISBN");
        }
    }
}