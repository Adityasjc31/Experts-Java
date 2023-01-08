package recurrsion;

class for_SumDigits_recurrsion
{
    int n,s;
    public for_SumDigits_recurrsion()
    {
        n=0;
        s=0;
    }

    public void input(int n)
    {
        this.n=n;
    }
    
    public void SumDigits()
    {
        if(n>1)
        {
            int t=n;
            int d=n%10;
            s=s+d;
            n/=10;
            SumDigits();
            n=t;
        }
    }
    
    public void display()
    {
        System.out.println("Sum of digits are = "+s);
    }
}