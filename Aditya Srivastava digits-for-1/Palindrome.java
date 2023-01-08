import java.util.*;
class Palindrome
{
    public static void main(String args [])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int u=sc.nextInt(),r=0;
        for(int n=u;n!=0;n=n/10)
        {
            int d=n%10;
            r=r*10+d;
        }
        if(u==r)
        {
            System.out.println("Palindrome");
        }
        else
        {
            System.out.println("Not a Palindrome");
        }
    }
}