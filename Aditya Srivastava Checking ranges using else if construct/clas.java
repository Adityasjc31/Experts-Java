import java.util.*;
class clas
{
    public static void main(String args [])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Class");
        double a=sc.nextDouble();
        if(a>=1&&a<=5)
        {
            System.out.println("Primary");
        }
        else if(a>=6&&a<=8)
        {
            System.out.println("Secondary");
        }
        else if(a>=9&&a<=10)
        {
            System.out.println("High School");
        }
       else if(a>=11&&a<=12)
        {
            System.out.println("Intermidate");
        }
        else
        {
            System.out.println("Invalid Input");
        }
    }
}