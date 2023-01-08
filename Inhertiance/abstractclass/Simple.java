package Inhertiance.abstractclass;

class Simple extends Account
{
    public Simple(int an,double p,double r,int t)
    {
        super(an,p,r,t);
    }
    
    public double interest()
    {
        return (principal*rate*time)/100;
    }
}