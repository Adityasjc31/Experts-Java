import java.util.*;
class speed
{
    public static void main(String args [])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Distance in KM");
        int l=sc.nextInt();
        System.out.println("Enter time in HRS");
        double b=sc.nextDouble();
        double s=l/b;
        System.out.println("Speed="+s+"KM/H");
    }
}