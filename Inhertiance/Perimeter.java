package Inhertiance;


public class Perimeter
{
    protected double a,b;
    public Perimeter(int a,int b)
    {
        this.a=a;
        this.b=b;
    }
    
    public double Calculate()
    {
        return 2*(a+b);
    }
    
    public void show()
    {
        System.out.println("Length = "+a);
        System.out.println("Breadth = "+b);
        System.out.println("Perimeter = "+Calculate());
    }
}