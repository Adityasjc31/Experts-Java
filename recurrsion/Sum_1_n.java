package recurrsion;

class Sum_1_n
{
    public static int sum(int n)
    {
        if(n>1)
        {
            return n+sum(n-1);
        }
        else
        {
            return n;
        }
    }
}