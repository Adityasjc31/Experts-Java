import java.util.*;
class Square1
{
    int side;
    public void input(int s)
    {
        side = s;
    }
    
    public int area()
    {
        return side*side;
    }
    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter side");
        int S = sc.nextInt();
        Square1 s = new Square1();
        s.input(S);
        System.out.println("Area = "+s.area());
    }
}