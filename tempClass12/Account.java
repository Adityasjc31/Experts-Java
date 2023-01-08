package tempClass12;

class Account extends Bank
{
    double amt;
    public Account(String name , long accno)
    {
        super(name,accno);
        amt=0.0;
    }

    public void deposit(double amt)
    {
        super.p=+amt;
    }

    public void withdraw(double am)
    {
        amt=am;

        if(super.p<amt)
        {
            System.out.println("Insufficient Balance");
        }
        super.p=super.p-amt;
        if(super.p<500)
        {
            super.p=super.p-(500-super.p)/100;
        }
    }

    public void display()
    {
        super.display();
        System.out.println("Principal Amount : "+super.p);
    }
}