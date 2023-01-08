package tempClass12.interface_practice;

public class geometry implements Circle_,Square,rectangle_
{
    double area1;
    int area2,area3;

    public void area_Circle()
    {
        area1 = pie * radius * radius;
        System.out.println("Area of Circle = "+area1);
    }

    public void area_square()
    {
        area2 = side*side;
        System.out.println("Area of square = "+area2);
    }
    
    public void area_rectangle()
    {
        area3=l*b;
        System.out.println("Area of Rectangle = "+area3);
    }
}