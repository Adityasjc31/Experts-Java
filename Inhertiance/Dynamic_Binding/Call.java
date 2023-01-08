package Inhertiance.Dynamic_Binding;

import java.util.*;
class Call
{
    public static void main(String args[])
    {
        System.out.println("Menu\n1 - Circle\n2 - Rectangle\n3 - Square\n4 - Triangle\nEnter your Choice");
        int ch = new Scanner(System.in).nextInt();
        Shape ob=null;
        switch(ch)
        {
            case 1:
            ob = new Circle();
            break;

            case 2:
            ob = new Rectangle();
            break;

            case 3:
            ob = new Square();
            break;
            
            case 4:
            ob = new Triangle();
            break;
        }
        ob.input();
        System.out.println("Area = "+ob.area());
    }
}