import java.util.*;
class sd
{
    public static void readFile()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("1-To check Class");
        System.out.println("2-To check whether number is odd or even");
        System.out.println("3-To check whether Year is Leap or not");
        int c=sc.nextInt();
        switch(c)
        {
            case 1:
            Class ob=new Class();
            ob.display();
            break;
            case 2:
            Number oba=new Number();
            oba.display();
            break;
            case 3:
            Year obb=new Year();
            obb.display();
            break;
            default:
            System.out.println("Invalid Input");
        }
    }
}