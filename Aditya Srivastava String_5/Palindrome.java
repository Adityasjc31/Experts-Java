import java.util.*;
class Palindrome
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any String");
        String s =sc.next(),n="";

        for(int x=0;x<s.length();x++)
        {
            char ch=s.charAt(x);
            n=ch+n;
        }
        if(n.equalsIgnoreCase(s))
        {
            System.out.println("Palindrome");
        }
        else 
        {
            System.out.println("Not Palindrome");
        }
    }
}