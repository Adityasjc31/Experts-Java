package Inhertiance;


public class Area extends Perimeter
{
    protected double h,area;
    public Area(int l,int b,int h)
    {
        super(l,b);
        this.h=h;
        area=0.0;
    }
    
    public void doarea()
    {
        area = super.b*h;
    }
    
    public void show()
    {
        System.out.println("Height = "+h);
        super.show();
        doarea();
        System.out.println("Area = "+area);
    }
}