import java.util.Scanner;
public class Recursion_41
{
    public static double pow(int a,int b)
    {
        if(b>0)
        {
            return a*pow(a,b-1);
        }
        else if(b==0)
        {
            return 1;
        }
        else
        {
            return 1/pow(a,-b);
        }
    }

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value of a");
        int a=sc.nextInt();
        System.out.println("Enter value of b");
        int b=sc.nextInt();
        double p=pow(a,b);
        System.out.println("a^b = "+p);
    }
}