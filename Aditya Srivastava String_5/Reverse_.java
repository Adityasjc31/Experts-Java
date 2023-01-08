import java.util.*;
class Reverse_
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
                n=ch+n;
            }
            else 
            {
                System.out.print(n+ch);
                n="";
            }
        }
    }
}