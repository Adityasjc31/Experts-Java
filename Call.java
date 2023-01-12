class Box
{
    double height;
    double width;
    double depth;
    public Box()
    {
        height=0;
        width=0;
        depth=0;
    }
    
    public Box(double height,double width,double depth)
    {
        this.height=height;
        this.width=width;
        this.depth=depth;
    }
    
    public double area()
    {
        return height*width;
    }
    
    public double volume()
    {
        return height*width*depth;
    }
}

public class Call
{
    public static void main(String args[])
    {
        Box b1 = new Box();
    }
}