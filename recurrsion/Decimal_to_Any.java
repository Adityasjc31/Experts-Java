package recurrsion;

class Decimal_to_Any
{
    public static void toBinary(int n)
    {
        if(n>1)
        {
            toBinary(n/2);
        }
        System.out.print(n%2);
    }

    public static void toOctal(int n)
    {
        if(n>7)
        {
            toOctal(n/8);
        }
        System.out.print(n%8);
    }
    
    static char ar[]={'A','B','C','D','E','F'};
    public static void toHexaDecimal(int n)
    {
        if(n>15)
        {
            toHexaDecimal(n/16);
        }
        if(n%16<10)
            System.out.print(n%16);
        else
            System.out.print(ar[n%16-10]);
    }
}