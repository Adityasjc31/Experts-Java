import java.util.*;
class Fibonacci_entering_terms
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");int n=sc.nextInt();
        int a=0;int b=1;
        while(a+b<=n)
        {
            int c=a+b;System.out.println(c);a=b;b=c;
        }
    }
}