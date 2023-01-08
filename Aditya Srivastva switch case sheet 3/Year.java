import java.util.*;
class Year
{
    public static void display()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter year");
        int y=sc.nextInt();
        switch(y%4)
        {
            case 0:
            System.out.println("Leap Year");
            break;
            default:
            System.out.println("Not a Leap year");
        }
    }
}