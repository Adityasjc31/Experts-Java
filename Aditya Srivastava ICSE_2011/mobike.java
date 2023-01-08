import java.util.*;
class mobike
{
    String name;int bno,phno,days,charge;
    public void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name ");
        name=sc.nextLine();
        System.out.println("Enter bike number ");
        bno=sc.nextInt();
        System.out.println("Enter phone number ");
        phno=sc.nextInt();
        System.out.println("Enter number of days taken at rent ");
        days=sc.nextInt();
    }

    public void calc()
    {
        int d=days;
        if(d>=1 && d<=5)
        {
            charge = d*500;
        }
        else if(d>=6 && d<=10)
        {
            charge = (5*500)+((d-5)*400);
        }
        else if(d>=11)
        {
            charge = (5*500)+(5*400)+((d-10)*200);
        }
    }

    public void display()
    {
        System.out.println("Name = "+name);
        System.out.println("Bike Number = "+bno);
        System.out.println("Phone Number = "+phno);
        System.out.println("Days = "+days);
        System.out.println("Charge = "+charge);
    }

    public static void main(String args  [])
    {
        mobike ob = new mobike();
        ob.input();
        ob.calc();
        ob.display();
    }
}