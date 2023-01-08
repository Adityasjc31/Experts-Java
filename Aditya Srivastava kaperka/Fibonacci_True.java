import java.util.*;
class Fibonacci_True
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");int n=sc.nextInt();
        int a=0;int b=1;
        while(true)
        {
            int c=a+b;if(c>n){break;}System.out.println(c);a=b;b=c;
        }
    }
}