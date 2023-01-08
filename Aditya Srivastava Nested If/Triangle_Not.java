import java.util.*;
class Triangle_Not
{
    public static void main(String args [])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter First angle");
        int a=sc.nextInt();
        System.out.println("Enter Second angle");
        int b=sc.nextInt();
        System.out.println("Enter Thrid Angle");
        int c=sc.nextInt();
        if((a+b+c)==180)
        {
            if(a<90&&b<90&&c<90)
            {
                System.out.println("Acute angle");
            }
            else if(a>90||b>90||c>90)
            {
                System.out.println("Obtuse Angle");
            }
            else 
            {
                System.out.println("Right Angled Triangle");
            }
        }
        else        
        {
            System.out.println("Invalid Choice");
        }
    }
}