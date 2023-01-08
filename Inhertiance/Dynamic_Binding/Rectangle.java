package Inhertiance.Dynamic_Binding;

import java.util.*;
class Rectangle implements Shape
{
    double l,b;
    public void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length");
        l=sc.nextDouble();
        System.out.println("Ente breadth");
        b=sc.nextDouble();
    }
    
    public double area()
    {
        return l*b;
    }
}