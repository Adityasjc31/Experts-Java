package function;import java.util.*;
class Month_
{
    public static void display()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a month");
        int m=sc.nextInt();
        switch(m)
        {
            case 12:
            case 1:
            case 2:
            System.out.println("Winter");
            break;
            case 3:
            case 4:
            case 5:
            System.out.println("Spring");
            break;
            case 6:
            case 7:
            case 8:
            System.out.println("Summer");
            break;
            case 9:
            case 10:
            case 11:
            System.out.println("Autunm");
            break;
            default:
            System.out.println("Out of Range");
        }
    }
}