class ElectricBill extends A
{
    String n;
    int units;
    double bill;
    
    void accept()
    {
        System.out.println("Enter your name");
        n=sc.nextLine();
        System.out.println("Enter units that is consumed");
        units=sc.nextInt();
    }
    
    void calculate()
    {
        int u=units;
        if(u<=100)
        {
            bill = u*2.0;
        }
        else if(u>100 && u<=300)
        {
            bill = (u*2.0) + (u-300)*3.0;
        }
        else if(u>300)
        {
            bill = u*2.0 + u*3.0 + (u-300)*5;
            bill = 2.5/100.0*bill+bill;
        }
    }
    
    void print()
    {
        System.out.println("Name of the customer : "+n);
        System.out.println("Number of units consumed : "+units);
        System.out.println("Bill amount : "+bill);
    }
    
    public static void main(String args [])
    {
        ElectricBill e=new ElectricBill();
        e.accept();
        e.calculate();
        e.print();
    }
}