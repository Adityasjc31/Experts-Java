class Parking_Lot extends S
{
    int vno,hours;
    double bill;
    
    void input()
    {
        System.out.println("Enter vehicle Number : ");vno=sc.nextInt();
        System.out.println("Enter number of hours parked this vehicle with number: "+vno);hours=sc.nextInt();
    }
    
    void calculate()
    {
        double b=bill;
        if(b<=1)
        {
            bill=3.0;
        }
        else
        {
            bill=(3+Math.ceil((hours-1)*1.50));
        }
    }
    
    void display()
    {
        System.out.println("Vehicle Number : "+vno);
        System.out.println("Hours Parked : "+hours);
        System.out.println("Bill to be paid : "+bill);
    }
    
    public static void main(String args [])
    {
        Parking_Lot p = new Parking_Lot();
        p.input();
        p.calculate();
        p.display();
    }
}