package function;import java.util.*;
class Combinations
{
    public static void main(String args [])
    {
        int c;
        Scanner sc=new Scanner(System.in);
        System.out.println("1-To check The Bigger Number For Two Numbers");
        System.out.println("2-To check whether number is odd or even");
        System.out.println("3-To check whether Year is Leap or not");
        System.out.println("4-To check whether The Bigger Number For Three Numbers");
        System.out.println("5-To check whether The Smaller Number For Two Numbers");
        System.out.println("6-To check whether The Smaller Number For Three Numbers");
        try
        {
            c=sc.nextInt();
        }
        catch(InputMismatchException e)
        {
            System.out.println("dhang ka daaalo");
            String nikalo=sc.nextLine();//Enter Numeric value only
            c=sc.nextInt();
        }
        switch(c)
        {
            case 1:
            Bigger_2 ob=new Bigger_2();
            ob.readfile();
            break;
            case 2:
            Number oba=new Number();
            oba.readfile();
            break;
            case 3:
            Leap_Year_conditional obb=new Leap_Year_conditional();
            obb.readfile();
            break;
            case 4:
            Bigger_3 obd=new Bigger_3();
            obd.readfile();
            break;
            case 5:
            Smaller_2 obe=new Smaller_2();
            obe.readfile();
            break;
            case 6:
            Smaller_3 obf=new Smaller_3();
            obf.readfile();
            break;
            default:
            System.out.println("Invalid Input");
            System.out.println("Exiting...");
            System.exit(50);
        }
    }
}