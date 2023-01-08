import java.util.*;
class Call_Reverse
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number ");
        int n=sc.nextInt();
        if(n == Reverse.d(n))
        {
            System.out.println("Palindrome Number");
        }
        else
        {
            System.out.println("Not a Palindrome Number");
        }
    }
}