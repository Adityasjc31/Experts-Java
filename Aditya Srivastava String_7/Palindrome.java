import java.util.*;
class Palindrome
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any String");
        String s =sc.nextLine().toUpperCase();int s1=0,e=s.length()-1;
        boolean f=true;
        while(s1<e)
        {
            if(s.charAt(s1) !=  s.charAt(e))
            {
                f=false;
                break;
            }
            else
            {
                s1++;e--;
            }
        }
        if(!f)
        System.out.println("Not a Palindrome String");
        else 
        System.out.println("Palindrome String");
    }
}