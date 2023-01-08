import java.util.*;
class Rectangle
{
    int l,b,ar,p;
    public void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Length");l=sc.nextInt();
        System.out.println("Enter Breadth");b=sc.nextInt();
    }
    
    public void compute()
    {
        ar=l*b;
        p=2*(l+b);
    }
    
    public void display()
    {
        System.out.println("Area = "+ar);
        System.out.println("Perimeter = "+p);
    }
    
    public static void main()
    {
        Rectangle ob = new Rectangle();
        ob.input();
        ob.compute();
        ob.display();
    }
}