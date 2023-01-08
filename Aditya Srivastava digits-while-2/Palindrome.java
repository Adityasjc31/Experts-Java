import java.util.*;
class Palindrome
{
    public static void main(String args [])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int u=sc.nextInt(),n=u,r=0;
        while(n!=0)
        {
            int d=n%10;
            r=r*10+d;
            n=n/10;
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