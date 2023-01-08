package Inhertiance.Dynamic_Binding;

import java.util.*;
class Circle implements Shape
{
    double r;
    public void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius");
        r=sc.nextDouble();
    }

    public double area()
    {
        return 3.14*r*r;
    }
}