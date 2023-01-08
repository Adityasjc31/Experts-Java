import java.util.*;
class marks
{
    public static void main(String args [])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Marks");
        int m=sc.nextInt();
        if(m>=60)
        {
            if(m>=80)
            {
                if(m<=100)
                {
                    System.out.println("A");
                }
                else
                {
                    System.out.println("Invalid Input");
                }
            }
            else
            {
                System.out.println("B");
            }
        }
        else
        {
            if(m>=40)
            {
                System.out.println("C");
            }
            else
            {
                if(m>=0)
                {
                    System.out.println("F");
                }
                else
                {
                    System.out.println("Invalid Input");
                }
            }
        }
    }
}