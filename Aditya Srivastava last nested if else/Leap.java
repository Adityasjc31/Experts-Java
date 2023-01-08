import java.util.*;
class Leap
{
    public static void main(String args [])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter year");
        int y=sc.nextInt();
        if(y%100==0 && y%400==0 || y%4==0 && y%100!=0)
        {
            System.out.println("Leap Year");
        }
        else
        {
            System.out.println("Not a Leap Year");
        }
    }
}