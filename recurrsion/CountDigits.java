package recurrsion;

class CountDigits
{
    public static int CountDigits(int n)
    {
        if(n%10!=0)
        {
            return 1+CountDigits(n/10);
        }
        else
        {
            return 1;
        }
    }
}