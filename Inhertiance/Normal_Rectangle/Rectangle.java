package Inhertiance.Normal_Rectangle;

//import java.util.*;
/*final*/ class Rectangle
{
    protected int l,b;
    /*public void input()
    {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter l");
    l=sc.nextInt();
    System.out.println("Enter b");
    b=sc.nextInt();
    }*/

    /*final*/ public void input(int l,int b)
    {
        this.l=l;
        this.b=b;
    }

    /*final*/ public int area()
    {
        return l*b;
    }
}