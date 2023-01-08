package Inhertiance.abstractclass;

class Compound extends Account
{
    public Compound(int ac,double p,double r,int t)
    {
        super(ac,p,r,t);
    }
    
    public double interest()
    {
        return (principal*Math.pow(1 + (rate/100),time)) - principal;
    }
}