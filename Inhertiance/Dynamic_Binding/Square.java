package Inhertiance.Dynamic_Binding;

import java.util.*;
class Square implements Shape
{
    double s;
    public void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter side");
        s=sc.nextDouble();
    }
    
    public double area()
    {
        return s*s;
    }
}