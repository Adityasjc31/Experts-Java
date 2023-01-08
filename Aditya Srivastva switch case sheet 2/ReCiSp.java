import java.util.Scanner;
class ReCiSp
{
    public static void main(String args [])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("1\t-\tTo Find Area And Perimeter of Circle");
        System.out.println("2\t-\tTo Find Area And Perimeter of Sphere");
        System.out.println("3\t-\tTo Find Area And Perimeter of Rectangle");
        System.out.println("Enter Choice");
        int c=sc.nextInt();
        int f=-1;
        switch(c)
        {
            case 3:
            System.out.println("Enter Length ");
            double l=sc.nextDouble();
            System.out.println("Enter Breadth");
            double b=sc.nextDouble();
            System.out.println("Area ="+(l*b));
            System.out.println("Perimeter="+(2*(l*b)));
            break;
            case 1:
            System.out.println("Enter Radius Of A Circle");
            double r=sc.nextDouble();
            double ar=(22.0/7)*r*r;
            System.out.println("Area ="+ar);
            System.out.println("Area ="+(2*Math.PI*r));
            break;
            case 2:
            System.out.println("Enter Radius");
            int ra=sc.nextInt();
            System.out.println("Area="+(4*Math.PI*ra*ra));
            System.out.println("Volume="+((Math.PI)*(4/3)*(double)ra*ra));
            break;
            default:
            System.out.println("Invalid Input");
        }
    }
}