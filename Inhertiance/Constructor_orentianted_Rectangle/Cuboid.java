package Inhertiance.Constructor_orentianted_Rectangle;

class Cuboid extends Rectangle
{
    private int h;
    public Cuboid(int length,int breadth,int height)
    {
        super(length,breadth);
        h=height;
    }

    public int volume()
    {
        return l*b*h;
    }
}