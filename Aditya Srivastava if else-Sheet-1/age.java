import java.util.*;
class age
{
    public static void main(String args [])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Age");
        int a=sc.nextInt();
        if(a>=18)
        {
            System.out.println("He/She can vote");
        }
        else
        {
            System.out.println("He/She cannot vote");
        }
    }
}