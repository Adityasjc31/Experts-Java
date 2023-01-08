import java.util.*;
class Class
{
    public static void display()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Class");
        int c=sc.nextInt();
        switch(c)
        {
            case 1:case 2:case 3:case 4:case 5:
            System.out.println("Primary");
            break;
            case 6:case 7:case 8:
            System.out.println("Secondary");
            break;
            case 9:case 10:
            System.out.println("High School");
            break;
            case 11:case 12:
            System.out.println("Intermidate");
            break;
            default:
            System.out.println("Invalid Input");
        }
    }
}