import java.util.*;
class encrypt
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any String");
        String s = sc.nextLine(),n="";
        for(int x=0;x<s.length();x++)
        {
            char ch=s.charAt(x);
            if(Character.isUpperCase(ch))
            {
                if(ch=='Z')
                {
                    ch='A';
                    n=n+ch;
                }
                else
                {
                    ch++;
                    n=n+ch;
                }
            }
            else if(Character.isLowerCase(ch))
            {
                if(ch=='z')
                {
                    ch='a';
                    n=n+ch;
                }
                else
                {
                    ch++;
                    n=n+ch;
                }
            }
            else if(Character.isDigit(ch))
            {
                if(ch=='9')
                {
                    ch='0';
                    n=n+ch;
                }
                else
                {
                    ch++;
                    n=n+ch;
                }
            }
        }
        System.out.println("\nEncrpted Code\n"+n);
    }
}