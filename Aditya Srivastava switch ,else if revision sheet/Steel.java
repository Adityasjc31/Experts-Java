import java.util.*;
class Steel
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter steel components");
        System.out.print("Hardness : ");double h=sc.nextInt();
        System.out.print("Carbon Content : ");double c=sc.nextDouble();
        System.out.print("Tensile Strength : ");double ts=sc.nextInt();
        int g=5;
        if(h>50 && c<0.7 && ts>5600)
        {
            g=10;
        }
        else if(h>50 && c<0.7)
        {
            g=9;
        }
        else if(c<0.7 && ts>5600)
        {
            g=8;
        }
        else if(h>50 && ts>5600)
        {
            g=7;
        }
        else if(h>50 || c<0.7 || ts>5600)
        {
            g=6;
        }
        System.out.println("Grade = "+g);
    }
}