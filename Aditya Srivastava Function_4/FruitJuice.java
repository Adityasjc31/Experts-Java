import java.util.*;
class FruitJuice
{
    int product_code,pack_size,product_price;
    String flavor , pack_type;
    public FruitJuice()
    {
        product_code=pack_size=product_price=0;
        flavor=pack_type="";
    }

    public void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Flavor");
        flavor=sc.next();
        System.out.println("Enter pack Type");
        pack_type=sc.nextLine();
        System.out.println("Enter product price");
        product_price=sc.nextInt();
        System.out.println("Enter pack size");
        pack_size=sc.nextInt();
        System.out.println("Enter product code");
        product_code=sc.nextInt();
    }

    public void discount()
    {
        product_price-=10;
    }

    public void display()
    {
        System.out.println("Flavor = "+flavor);
        System.out.println("Pack Type = "+pack_type);
        System.out.println("Product Prize = "+product_price);
        System.out.println("Pack Prize = "+pack_size);
        System.out.println("Product Code = "+product_code);
    }

    public static void main()
    {
        FruitJuice ob = new FruitJuice();
        ob.input();
        ob.discount();
        ob.display();
    }
}