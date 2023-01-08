package tempClass12;

class Bank
{
    protected String name;
    protected long accno;
    protected double p;
    public Bank(String name,long accno)
    {
        this.name = name;
        this.accno = accno;
    }
    
    public void display()
    {
        System.out.println("Name of the customer : "+name);
        System.out.println(name + " account number : "+accno);
    }
}