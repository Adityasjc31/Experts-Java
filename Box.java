class Box
{
    private double height,breadth,length;
    public Box()
    {
        height=breadth=length=0;
    }

    public Box(double length,double breadth,double height)
    {
        setDimension(length,breadth,height);
    }

    public Box(Box b1)
    {
        setDimension(b1.length,b1.breadth,b1.height);
    }

    public void setDimension(double length,double breadth,double height)
    {
        this.length = length;
        this.breadth = breadth;
        this.height = height;
    }

    public double getHeight()
    {
        return height;
    }

    public double getBreadth()
    {
        return breadth;
    }

    public double getLength()
    {
        return length;
    }

    public double area()
    {
        return length*breadth;
    }

    public double volume()
    {
        return length*breadth*height;
    }
    
    public boolean compare(Box b1)
    {
        return b1.length==length && b1.breadth==breadth && b1.height==height;
    }
    
    public String print()
    {
        //System.out.println("Box [length = "+length+",breadth = "+breadth+",height = "+height);
        return "Box [length = "+length+",breadth = "+breadth+",height = "+height+"]";
    }
    
    public String toString()
    {
        return print();
    }
}