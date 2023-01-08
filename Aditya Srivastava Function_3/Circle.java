import java.util.*;
class Circle
{
    int r;
    double a,c;
    public void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius");r=sc.nextInt();
    }
    
    public void compute()
    {
        a=Math.PI*Math.pow(r,2);
        c=2*Math.PI*(double)r;
    }
    
    public void display()
    {
        System.out.println("Area = "+a);
        System.out.println("Circumfrance = "+c);
    }
    
    public static void main()
    {
        Circle ob = new Circle();
        ob.input();
        ob.compute();
        ob.display();
    }
}