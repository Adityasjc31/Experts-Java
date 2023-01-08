import java.util.*;
public class Rectangle1
{
    int length,breadth;
    public void input(int l,int b)
    {
        length = l;
        breadth = b;
    }
    
    int area()
    {
        return (length*breadth);
    }
    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length");
        int l = sc.nextInt();
        System.out.println("Enter breadth");
        int b = sc.nextInt();
        Rectangle1 ob = new Rectangle1();
        ob.input(l,b);
        System.out.println("Area = "+ob.area());
    }
}