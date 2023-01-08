package recurrsion;

class Reverse
{
    static int n,r;
    public Reverse()
    {
        n=0;
        r=1;
    }

    public static void input(int n1)
    {
        n=n1;
    }

    public static void reverse()
    {
        if(n>0)
        {
            int t=n;
            int d=n%10;
            r=r*10+d;
            n=n/10;
            reverse();
            n=t;
        }
    }
}