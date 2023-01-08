import java.util.*;
class Quadratic_Equation
{
    public static void main(String args [])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("ax²+bx+c=0 , a is not equal to 0");
        System.out.println("Enter the value of X cofficent");
        System.out.print("a=");int a=sc.nextInt();
        System.out.print("b=");int b=sc.nextInt();
        System.out.print("c=");int c=sc.nextInt();
        double f=Math.pow(b,2)-(4*a*c);
        double x,x1;
        if(Math.pow(b,2)>(4*a*c))
        {
            x=(-b+Math.sqrt(f));x1=(-b-Math.sqrt(f));
            System.out.println("X="+x+" or "+x1);
            if(Math.pow(b,2)>(4*a*c))
            {
                System.out.println("Real And Distint Roots");
            }
            else if(Math.pow(b,2)==(4*a*c))
            {
                System.out.println("Real and equal Roots");
            }
        }
        else
        {
            System.out.println("Imaginary roots can not be find");
        }
    }
}