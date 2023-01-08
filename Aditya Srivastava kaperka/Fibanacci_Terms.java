import java.util.*;
class Fibanacci_Terms
{
    public static void main(String args [])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of terms");int n=sc.nextInt();
        int a=0,b=1;
        if(n>=1)
        {
            System.out.println(a);
        }
        if(n>=2)
        {
            System.out.println(b);
        }
        for(int x=1;x<=n-2;x++)
        {
            int c=a+b;
            System.out.println(c);
            a=b;b=c;
        }
    }
}