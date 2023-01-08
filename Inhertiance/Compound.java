package Inhertiance;

class Compound extends Account
{
    double rate;
    int time;
    public Compound(int ac,double p,double r,int t)
    {
        super(ac,p);
        rate=r;
        time=t;
    }
    
    public double interest()
    {
        return (principal*Math.pow(1 + (rate/100),time)) - principal;
    }
    
    public void display()
    {
        super.display();
        System.out.println("rate = "+rate);
        System.out.println("time = "+time);
        System.out.println("interest = "+interest());
    }
}