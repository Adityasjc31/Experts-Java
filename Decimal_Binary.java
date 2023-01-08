import java.util.*;
class Decimal_Binary
{
    public static void main(String args [])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Decimal Number");
        int n=sc.nextInt();
        String b="";
        for(int x=n;x!=0;x/=2)
        {
            int r=x%2;
            b=r+b;
        }
        System.out.println("Binary Number : "+b);
    }
}