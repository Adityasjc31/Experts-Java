class employee extends A
{
    double basic;
    public void display()
    {
        double b=basic;
        double da=25/100*b;
        double hra=15/100*b;
        double pf=8.33/100*b;
        double np=b+da+hra;
        System.out.println("Gross pay = "+(np-pf));
    }
    
    public void input()
    {
        System.out.println("Enter the basic salary");
        basic=sc.nextDouble();
    }
    
    public static void main(String args [])
    {
        employee e=new employee();
        e.input();
        e.display();
    }
}