class Number
{
    static boolean b;
    public static void toBinary(long n)
    {
        if(b==false)
        {
            Display.display(n,(int)n);
            b=true;
        }
        Display.display(n/2,(int)n%2,(int)n);
        if(n>1)
        {
            toBinary(n/2);
        }
    }
}