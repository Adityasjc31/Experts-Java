import java.util.*;
class Electronis
{
    public static void main(String args [])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name ");String n=sc.nextLine();
        System.out.println("Enter "+n+" address");String a=sc.nextLine();
        System.out.println("Enter purchase amounty");int am=sc.nextInt();
        System.out.println("L - Laptop\nD - Desktop\nEnter the type of purchase");char ch = sc.next().charAt(0);
        double d=0.0;
        
        switch(ch)
        {
            case 'l' :case 'L':
            if(am<=25000)
            {
                d=0.0;
            }
            else if(am>=25001 && am<=57000)
            {
                d=5.0;
            }
            else if(am>=57001 && am<=100000)
            {
                d=7.5;
            }
            else if(am>100000)
            {
                d=10.0;
            }
            break;
            case 'd':case 'D':
            if(am<=25000)
            {
                d=5.0;
            }
            else if(am>=25001 && am<=57000)
            {
                d=7.5;
            }
            else if(am>=57001 && am<=100000)
            {
                d=10.0;
            }
            else if(am>100000)
            {
                d=15.0;
            } 
            break;
            default :
            System.out.println("Wrong Choice");
        }
        
        System.out.println("Name = "+n);
        System.out.println("Address = "+a);
        double dis=(d/100.0)*am;
        double pa=am-dis;
        System.out.println("Net Amount : "+pa);
    }
}