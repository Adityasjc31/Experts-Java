import java.util.*;
class Leap
{
    public static void readfile(String args [])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter year");
        int y=sc.nextInt();
        if(y%100==0)
        {
            if(y%400==0)
            {
                System.out.println("Leap Year");
            }
            else
            {
                System.out.println("Not a leap Year");
            }
        }
        else
        {
            if(y%4==0)
            {
                System.out.println("Leap Year");
            }
            else
            {
                System.out.println("Not a Leap Year");
            }
        }
    }
}