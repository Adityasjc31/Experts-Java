package recurrsion;

class for_CountDigits_recurrsion
{
    int n,c; 
    public for_CountDigits_recurrsion()
    {
        n=0;
        c=0;
    }

    public void input(int n)
    {
        this.n=n;
    }

    public void countDigits()
    {
        if(n>0)
        {
            int t=n;
            n/=10;
            c++;
            countDigits();
            n=t;
        }
    }
    
    public void display()
    {
        System.out.println("Number of Digits = "+c);
    }
}