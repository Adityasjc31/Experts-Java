import java.util.*;
class Obtuse_Triangle
{
    public static void main(String args [])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter First Angle");
        int a=sc.nextInt();
        System.out.println("Enter Second Angle");
        int b=sc.nextInt();
        System.out.println("Enter Thrid Angle");
        int c=sc.nextInt();
        if(a<=120||b<=120||c<=120)
        {
            System.out.println("Triangle is Obtuse angled triangle");
        }
        else
        {
            System.out.println("Triangle is not Obtuse angled triangle");
        }
    }
}