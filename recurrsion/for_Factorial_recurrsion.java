package recurrsion;

class for_Factorial_recurrsion
{
    int n,f;
    public for_Factorial_recurrsion()
    {
        n=0;
        f=1;
    }

    public void input(int n)
    {
        this.n=n;
    }
    
    public void factorial()
    {
        if(n>1)
        {
            int t=n;
            f*=n;
            n--;
            factorial();
            n=t;
        }
    }
    
    public void display()
    {
        System.out.println("Factorial = "+f);
    }
}