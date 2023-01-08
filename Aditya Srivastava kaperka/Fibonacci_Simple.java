class Fibonacci_Simple
{
    public static void main()
    {
        int a=0,b=1;System.out.println(a);System.out.println(b);
        for(int x=0;x<8;x++)
        {
            int c=a+b;
            System.out.println(c);
            a=b;b=c;
        }
    }
}