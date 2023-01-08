import java.util.*;
class ShopKeeper
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Selling Price");int a=sc.nextInt();
        System.out.println("Enter Cost Price");int b=sc.nextInt();
        if(b>a)
        {
            System.out.println("Loss = "+(b-a));
        }
        else if(a>b)
        {
            System.out.println("Profit = Rs"+(a-b));
        }
    }
}