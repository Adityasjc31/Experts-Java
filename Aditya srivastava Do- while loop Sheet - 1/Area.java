import java.util.*;
class Area
{
    public static void main(String args [])throws Exception
    {
        Scanner sc=new Scanner(System.in);
        double a;
        do
        {
            System.out.println("Menu");
            System.out.println("\f1 - Area of Circle\n2 - Area of Square\n3 - Area of Rectangle\n4 - Exit");
            int n=sc.nextInt();
            switch(n)
            {
                case 1:
                System.out.println("Enter radius");int r=sc.nextInt();
                a=Math.PI*r*r;
                System.out.println("Area="+a);
                break;
                case 2:
                System.out.println("Enter side");int s=sc.nextInt();
                a=Math.pow(s,2);
                System.out.println("Area="+a);
                break;
                case 3:
                System.out.println("Enter length");int l=sc.nextInt();
                System.out.println("Enter width");int w=sc.nextInt();a=l*w;
                System.out.println("Area="+a);
                break;
                case 4:
                System.out.println("Exiting...");
                System.exit(1000);
                break; 
                default :
                System.out.println("Wrong Choice");
            }
            Thread.sleep(1800);
        }while(true);
    }
}