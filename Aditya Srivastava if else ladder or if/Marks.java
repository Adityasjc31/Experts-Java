import java.util.*;
class Marks
{
    public static void main(String args [])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Marks For Maths");
        int a=sc.nextInt();
        System.out.println("Enter Marks For Physics");
        int b=sc.nextInt();
        System.out.println("Enter Marks For Chemistry");
        int c=sc.nextInt();
        System.out.println("Enter Marks For Biology");
        int d=sc.nextInt();
        System.out.println("Enter Marks For Computer");
        int e=sc.nextInt();
        if(a>=90)
        {
            System.out.println("Maths ="+a);
        }
        if(b>=90)
        {
            System.out.println("Physics ="+b);
        }
        if(c>=90)
        {
            System.out.println("Chemistry ="+c);
        }
        if(d>=90)
        {
            System.out.println("Biology ="+d);
        }
        if(e>=90)
        {
            System.out.println("Computer ="+e);
        }
    }
}