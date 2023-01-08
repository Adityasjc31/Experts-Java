package tempClass12.interface_practice;

class Rectangle implements Shape
{
    double length,breadth;
    
    public Rectangle(double l,double b)
    {
        length = l;
        breadth = b;
    }
    
    public double area()
    {
        return length*breadth;
    }
}