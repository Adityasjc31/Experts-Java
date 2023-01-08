package Inhertiance.Constructor_orentianted_Rectangle;

class Rectangle
{
    protected int l,b;
    public Rectangle()
    {
        l=10;
        b=5;
    }

    public Rectangle(int length,int breadth)
    {
        l=length;
        b=breadth;
    }

    public int area()
    {
        return l*b;
    }
}