package function;import java.util.*;
class Comb
{
    public static void main(String args [])
    {
        int c;
        Scanner sc=new Scanner(System.in);
        System.out.println("1-To print your name 5 times");
        System.out.println("2-To check whether number is odd or even");
        System.out.println("3-To check whether Year is Leap or not");
        System.out.println("4-To check whether The Bigger Number For Three Numbers");
        System.out.println("5-To check whether The Smaller Number For Two Numbers");
        System.out.println("6-To check whether The Smaller Number For Three Numbers");
        System.out.println("7-To check whether The Smaller Number For Three Numbers");
        System.out.println("8-To check whether The Smaller Number For Three Numbers");
        System.out.println("9-To check whether The Smaller Number For Three Numbers");
        try
        {
            c=sc.nextInt();
        }
        catch(InputMismatchException e)
        {
            System.out.println("Enter Numeric value only");
            String nikalo=sc.nextLine();
            c=sc.nextInt();
        }
        switch(c)
        {
            case 1:
            Name ob=new Name();
            ob.readfile();
            break;
            case 2:
            Num oba=new Num();
            oba.readfile();
            break;
            case 3:
            no obb=new no();
            obb.readfile();
            break;
            case 4:
            nos obd=new nos();
            obd.readfile();
            break;
            case 5:
            nosssss obe=new nosssss();
            obe.readfile();
            break;
            case 6:
            Numberss obf=new Numberss();
            obf.readfile();
            break;
            case 7:
            Numbers obn=new Numbers();
            obn.readfile();
            break;
            case 8:
            N_1024 obu=new N_1024();
            obu.readfile();
            break;
            default:
            System.out.println("Invalid Input");
            System.out.println("Exiting...");
            System.exit(50);
        }
    }
}