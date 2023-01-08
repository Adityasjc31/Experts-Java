package Inhertiance.Normal_Rectangle;

//import java.util.*;
class Cuboid extends Rectangle
{
    private int h;
    /* public void input()
    {
    super.input();
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter H");
    h = sc.nextInt();
    }*/

    public void input(int l,int b,int h)
    {
        super.input(l,b);
        this.h=h;
    }

    public int area()
    {
        return 2*(l*b+b*h+h*l);
    }

    /*public void area()
    {
        System.out.println(2*(l*b+b*h+h*l));
    }*/
    
    public int volume()
    {
        return h*super.area();
    }
}