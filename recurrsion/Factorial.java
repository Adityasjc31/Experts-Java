package recurrsion;

class Factorial
{
    public static int factorial(int n)
    {
        return n<=1 ? 1 : n*factorial(n-1);
    }
}