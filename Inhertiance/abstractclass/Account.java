package Inhertiance.abstractclass;


abstract class Account
{
    protected int accountNumber,time;
    protected double principal,rate;
    public Account(int an,double p,double r,int t)
    {
        accountNumber = an;
        principal = p;
        time=t;
        rate=r;
    }
    
    abstract double interest();
    
    public void display()
    {
        System.out.println("account number = "+accountNumber);
        System.out.println("principal = "+principal);
        System.out.println("rate = "+rate);
        System.out.println("time = "+time);
        System.out.println("interest = "+interest());
    }
}