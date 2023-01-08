import java.util.*;
class taxi_Meter
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of Kilometers the Taxi has moved the distance");
        int k=sc.nextInt();
        int b=0;
        if(k==1)
        {
            b=20;
        }
        else if(k>1 && k<=5)
        {
            b=20*1+((k-1)*10);
        }
        else if(k>5 && k<=16)
        {
            b=20*1+10*5+((k-6)*12);
        }
        else if(k>16)
        {
            b=20*1+5*10+10*12+((k - 16)*15);
        }
        System.out.println("Bill = "+b);
    }
}