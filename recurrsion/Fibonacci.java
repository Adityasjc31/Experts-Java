package recurrsion;

class Fibonacci
{
    public static int fib_term(int n)
    {
        if(n>2)
        {
            return fib_term(n-1)+fib_term(n-2);
        }
        else if(n==2)
        {
            return 1;
        }
        else
        {
            return 0;
        }
    }
}