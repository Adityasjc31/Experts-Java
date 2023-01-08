package Inhertiance;

class Simple extends Account
{
    double rate;
    int time;
    public Simple(int an,double p,double r,int t)
    {
        super(an,p);
        rate=r;
        time=t;
    }
    
    public double interest()
    {
        return (principal*rate*time)/100;
    }
    
    public void display()
    {
        super.display();
        System.out.println("rate = "+rate);
        System.out.println("time = "+time);
        System.out.println("interest = "+interest());
    }
}