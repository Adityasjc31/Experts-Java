package recurrsion;

class GCD
{
    public static int GCD(int s,int b)
    {
        if(b%s==0)
        {
            return s;
        }
        else
        {
            return GCD(b%s,s);
        }
    }
}