class Power_Recurrsion
{
    public static double power(int a,int b)
    {
        if(b==1)
        {
            return a;
        }
        else
        {
            return a*power(a,--b);
        }
    }
}