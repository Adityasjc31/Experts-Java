package isc2014;

class Stock
{
    protected String item;
    protected int qty;
    protected double rate;
    protected double amt;
    Stock(String i,int q,double r,double a)
    {
        item=i;
        qty=q;
        rate=r;
        amt=qty*rate;
    }
    
    void display()
    {
        System.out.println("Item : "+item);
        System.out.println("Quantity : "+qty);
        System.out.println("Rate : "+rate);
        System.out.println("Amount : "+amt);
    }
}