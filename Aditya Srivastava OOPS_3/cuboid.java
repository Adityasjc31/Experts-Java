class cuboid extends Rectangle
{
    int h;
    public void input(int l,int b,int h)
    {
        super.input(l,b);
        this.h=h;
    }
    
    public void display()
    {
        super.display();
        System.out.println("h = "+h);
    }
}