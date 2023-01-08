import java.util.*;
class Serie
{
    public static void main(String args [])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of x");int x=sc.nextInt();
        double s=0;
        for(int a=2;a<=20;a+=3)
        {
            s=s+((double)x/a);
        }
        System.out.println("Sum = "+s);
    }
}