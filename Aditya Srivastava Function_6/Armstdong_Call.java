import java.util.*;
class Armstdong_Call
{
    public static void main(String args [])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter smaller number");
        int s=sc.nextInt();
        System.out.println("Enter bigger number");
        int b=sc.nextInt();
        for(int x=s ; x<=b ; x++)
        {
            if(Armstrong.isArmstrong(x))
            {
                System.out.println(x);
            }
        }
    }
}