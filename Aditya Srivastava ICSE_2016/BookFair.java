import java.util.*;
class BookFair extends A
{
    String bname;
    double price;
    
    public BookFair()
    {
        bname=null;
        price=0.0;
    }
    
    void Input()
    {
        System.out.println("Enter the book name : ");bname=sc.nextLine();
        System.out.println("Enter the price of "+bname);price=sc.nextDouble();
    }
    
    void calculate()
    {
        double p=price;
        if(p<=100)
        {
            price=2/100.0*p;
        }
        else if(p>1000 && p<=3000)
        {
            price=10/100.0*p;
        }
        else if(p>3000)
        {
            price=15/100.0*p;
        }
    }
    
    void display()
    {
        System.out.println("Name of the book : "+bname);
        System.out.println("Price of Book after Discount : "+price);
    }
    
    public static void main(String args [])
    {
        BookFair b = new BookFair();
        b.Input();
        b.display();
        b.calculate();
        b.display();
    }
}