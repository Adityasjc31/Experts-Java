package Inhertiance;

class Account
{
    protected int accountNumber;
    protected double principal;
    public Account(int an,double p)
    {
        accountNumber = an;
        principal = p;
    }
    
    public void display()
    {
        System.out.println("account number = "+accountNumber);
        System.out.println("principal = "+principal);
    }
}