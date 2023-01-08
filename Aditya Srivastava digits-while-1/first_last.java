import java.util.*;
class first_last
{
    public static void main(String args [])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a four digit");
        int n=sc.nextInt();
        if(n>=1000 && n<=9999)
        {
            int s=n/10;
            System.out.println("First digit "+s);
            int d=n%10;
            System.out.println("Last digit "+d);
        }
        else
        {
            System.out.println("Not a four digit number");
        }
    }
}