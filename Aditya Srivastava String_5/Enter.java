import java.util.*;
class Enter
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any String");
        String s =sc.nextLine()+" ",n="";

        for(int x=0;x<s.length();x++)
        {
            char ch=s.charAt(x);
            if(ch!=' ')
            {
                n=n+ch;
            }
            else 
            {
                System.out.println(n);
                n="";
            }
        }
    }
}