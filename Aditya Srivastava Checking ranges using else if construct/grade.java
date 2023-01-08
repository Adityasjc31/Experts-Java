import java.util.*;
class grade
{
    public static void main(String args [])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Marks");
        int a=sc.nextInt();
        if(a>=80&&a<=100)
        {
            System.out.println("A-grade");
        }
        else if(a>=60&&a<=79)
        {
            System.out.println("B-grade");
        }
        else if(a>=40&&a<=59)
        {
            System.out.println("C-grade");
        }
       else if(a>=0&&a<=39)
        {
            System.out.println("F-grade");
        }
        else
        {
            System.out.println("Invalid marks");
        }
    }
}