class Q6 extends A
{
    public void area(double r)
    {
        System.out.println("Circle area : "+(3.14*r*r));
    }
    
    public void area(int s)
    {
        System.out.println("Square area : "+(s*s));
    }
    
    public void area(double l , double b)
    {
        System.out.println("Area of rectangle : "+(l*b));
    }
    
    public static void main(String args [])
    {
        System.out.println("Menu:\n1 - To calculate area of circle\n2 - To calculate area of Square\n3 - To calculate area of rectangle\nEnter your choice");
        int n=sc.nextInt();
        Q6 no = new Q6(); 
        switch(n)
        {
            case 1:
            System.out.println("Enter radius of a circle");
            no.area(sc.nextDouble());
            break;
            
            case 2:
            System.out.println("Enter side of a square");
            no.area(sc.nextInt());
            break;
            
            case 3:
            System.out.println("Enter length of the rectangle");
            double l=sc.nextDouble();
            System.out.println("Enter breadth of the rectangle");
            double b=sc.nextDouble();
            no.area(l,b);
            break;
            
            default:
            System.out.println("Wrong Choice");
        }
    }
}