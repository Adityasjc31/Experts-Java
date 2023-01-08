import java.util.*;
class angle
{
    public static void main(String args [])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter angle");
        int a=sc.nextInt();
        if(a<180)
        {
            if(a>=0)
            {
                if(a<90)
                {
                    System.out.println("Acute Angle");
                }
                else
                {
                    if(a==90)
                    {
                        System.out.println("Right Angle");
                    }
                    else
                    {
                        System.out.println("Obtuse Angle");
                    }
                }
            }
            else
            {
                System.out.println("Invalid Input");
            }
        }
        else
        {
            if(a<=359)
            {
                if(a==180)
                {
                    System.out.println("Straight Angle");
                }
                else
                {
                    System.out.println("Reflex Angle");
                }
            }
            else
            {
                System.out.println("Complete Angle");
            }
        }
    }
}