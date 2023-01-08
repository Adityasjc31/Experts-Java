import java.util.*;
class Palindrome
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any String");
        String s =sc.nextLine()+" ",w="",n="";
        int c=0;
        for(int x=0;x<s.length();x++)
        {
            char ch=s.charAt(x);
            if(Character.isLetter(ch))
            {
                w=w+ch;
                n=ch+n;
            }
            else if(w.length()>0)
            {
                if(w.equalsIgnoreCase(n))
                {
                    System.out.println(w);
                    c++;
                }
                w="";n="";
            }
        }
        System.out.println(c+" Palindrome Words");
    }
}