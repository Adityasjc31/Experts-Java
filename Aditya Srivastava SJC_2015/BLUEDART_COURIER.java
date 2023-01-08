import java.util.*;
class BLUEDART_COURIER
{
    public static void main(String args [])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter th weight of the body(in kg)");double n=sc.nextDouble(),s=0.0;
        if(n==1)
        {
            s=35.00;
        }
        else 
        {
            double x=(n*1000)/400.0;
            s=(13*x)-35.00;
        }
        System.out.println("Rs."+s);
    }
}