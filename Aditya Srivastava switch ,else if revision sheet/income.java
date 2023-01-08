import java.util.*;
class income
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Total Annual Income");
        int tai=sc.nextInt();
        int an=tai*12;
        double t=0;
        if(an<=100000)
        {
            System.out.println("No Tax");
        }
        else if(an>100000 && an<=150000)
        {
            t=((an-100000)*0.1);
        }
        else if(an>150000 && an <=250000)
        {
            t=5000+(((an-150000))*0.2);
        }
        else if(an>250000)
        {
            t=(((an-250000)*0.3)+25000);
        }
        if(t>0)
        {
            System.out.println("Tax = "+t);
        }
    }
}