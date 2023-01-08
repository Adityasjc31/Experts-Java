import java.util.*;
class Right_Triangle
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
        if(a==90||b==90||c==90)
        {
            System.out.println("Triangle is Right angled triangle");
        }
        else
        {
            System.out.println("Triangle is not Right angled triangle");
        }
    }
}