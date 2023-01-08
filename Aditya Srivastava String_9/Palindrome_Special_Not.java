import java.util.*;
class Palindrome_Special_Not
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any String");
        String s = sc.next().toUpperCase();
        boolean p=true,p1=true;
        int a=0,b=s.length()-1;
        while(a<b)
        {
            if(s.charAt(a)!=s.charAt(b))
            {
                p=false;
                break;
            }
            a++;b--;
        }
        if(p==true)
        {
            System.out.println("Palindrome Word\nSpecial Word");
        }
        else if(p==false)
        {
            if(s.charAt(0)!=s.charAt(s.length()-1))
            {
                p1=false;
            }
            else
            {
                System.out.println("Special Word");
            }
        }

        if(p==false && p1==false)
        {
            System.out.println("Not a Palindrome nor Special Word");
        }
    }
}