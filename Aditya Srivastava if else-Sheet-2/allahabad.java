import java.util.*;
class allahabad
{
    public static void main(String args [])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Name ");
        String l=sc.nextLine();
        System.out.println("Enter City ");
        String b=sc.nextLine();
        if(b.equalsIgnoreCase("Allahabad"))
        {
            System.out.println("Yes, "+l +" lives in Allahabad");
        }
        else
        {
            System.out.println("No, "+l+" lives in "+b);
        }
    }
}