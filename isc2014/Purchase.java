package isc2014;

class Purchase extends Stock
{
    int pqty;
    double prate;
    Purchase(String i,int q,double r,double a,int pq,double pr)
    {
        super(i,q,r,a);
        pqty = pq;
        prate = pr;
    }
    
    void update()
    {
        rate=prate;
        qty += pqty;
        amt = qty*rate;
    }
    
    void display()
    {
        super.display();
        update();
        super.display();
    }
}