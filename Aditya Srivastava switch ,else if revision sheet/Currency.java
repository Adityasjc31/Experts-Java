import java.util.*;
class Currency
{
    public static void main()
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("1 - French");
        System.out.println("2 - D.M.");
        System.out.println("3 - Lira");
        System.out.println("4 - Yen");
        System.out.println("5 - US$");
        System.out.println("6 - Pound");
        System.out.println("Enter amount");int a=sc.nextInt();
        System.out.println("Enter your choice");int ch=sc.nextInt();
        double co=0;
        switch(ch)
        {
            case 1 : 
            co=12.87*a;
            break;
            case 2 :
            co = 30.06*a;
            break;
            case 3:
            co=4.35*a;
            break;
            case 4:
            co=38.72*a;
            break;
            case 5:
            co=36.28*a;
            break;
            case 6:
            co=40.28*a;
            break;
            default :
            System.out.println("Invalid Choice");
        }
        if(co>0)
        {
            System.out.println("In Rs . "+co);
        }
    }
}