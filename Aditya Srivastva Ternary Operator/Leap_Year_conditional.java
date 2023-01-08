import java.util.*;
class Leap_Year_conditional
{
    public static void readfile()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter year");
        int y=sc.nextInt();
        System.out.println((y%100==0)?(y%400==0?"Leap Year":"Not a Leap Year"):(y%4==0?"Leap Year":"Not a Leap Year"));
    }
}