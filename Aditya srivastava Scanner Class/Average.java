import java.util.*;
class Average
{
    public static void main(String args [])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter marks in physics");
        int l=sc.nextInt();
        System.out.println("Enter marks in Chemistry");
        int b=sc.nextInt();
        System.out.println("Enter marks in Maths");
        int c=sc.nextInt();
        int t=l+b+c;
        double av=((double)(l+b+c)/3);
        System.out.println("Total="+t);
        System.out.println("Average="+av);
    }
}