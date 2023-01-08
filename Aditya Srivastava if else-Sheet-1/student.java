import java.util.*;
class student
{
    public static void main(String args [])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Marks Of The Student");
        int a=sc.nextInt();
        if(a>=40)
        {
            System.out.println("PASS");
        }
        else
        {
            System.out.println("FAIL");
        }
    }
}