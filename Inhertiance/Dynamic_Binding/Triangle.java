package Inhertiance.Dynamic_Binding;

import java.util.*;
class Triangle implements Shape
{
    double b,h;
    public void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter base");
        b = sc.nextInt();
        System.out.println("Enter height");
        h = sc.nextInt();
    }
    
    public double area()
    {
        return 0.5*b*h;
    }
}