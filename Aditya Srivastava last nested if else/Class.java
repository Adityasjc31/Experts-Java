import java.util.*;
class Class
{
    public static void main(String args [])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Class");
        int c=sc.nextInt();
        if(c<=8)
        {
            if(c<=5)
            {
                if(c>=1)
                {
                    System.out.println("Primary");
                }
                else
                {
                    System.out.println("Invalid Input");
                }
            }
            else
            {
                System.out.println("Secondary");
            }
        }
        else
        {
            if(c<=10)
            {
                System.out.println("High School");
            }
            else
            {
                if(c<=12)
                {
                    System.out.println("Intermidate");
                }
                else
                {
                    System.out.println("Invalid Input");
                }
            }
        }
    }
}