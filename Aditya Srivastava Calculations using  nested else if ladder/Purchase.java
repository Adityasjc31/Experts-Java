import java.util.Scanner;
class Purchase
{
    public static void display()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter type of Department");
        String t=sc.next();
        int p=0;
        if(t.equalsIgnoreCase("Cloth") || t.equalsIgnoreCase("Electronics"))
        {
            System.out.println("Enter Purchase Amount");
            p=sc.nextInt();
        }
        double d=-1.0;
        if(t.equalsIgnoreCase("Cloth"))
        {
            if(p>=0 && p<=2500)
            {
                d=2;
            }
            else if(p>=2501 && p<=5000)
            {
                d=3;
            }
            else if(p>=5001 && p<= 7500)
            {
                d= 3.5;
            }
            else if(p>=7501)
            {
                d=4.0;
            }
            else
            {
                System.out.println("Invalid Input");
            }
        }
        else if(t.equalsIgnoreCase("Electronics"))
        {
            if(p>=0 && p<=2500)
            {
                d=3;
            }
            else if(p>=2501 && p<=5000)
            {
                d=5;
            }
            else if(p>=5001 && p<=7500)
            {
                d=6;
            }
            else if(p>=75001)
            {
                d=8;
            }
            else
            {
                System.out.println("Invalid Input");
            }
        }
        else
        {
            System.out.println("Invalid Department");
        }
        if(d>-1 && t.equalsIgnoreCase("Cloth") || t.equalsIgnoreCase("Electronics"))
        {
            double dis=d*p/100.0;
            double amp=p-dis;
            System.out.println("Purchase Amount ="+p);
            System.out.println("Discount="+dis);
            System.out.println("Amount payable="+amp);
        }
    }
}