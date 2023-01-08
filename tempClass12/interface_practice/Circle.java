package tempClass12.interface_practice;

class Circle implements Shape
{
    double radius;
    public Circle(int r)
    {
        radius=r;
    }
    
    public double area()
    {
        return 3.14*radius*radius;
    }
}