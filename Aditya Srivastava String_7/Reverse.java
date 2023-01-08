import java.util.*;
class Reverse
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any String");
        String s =sc.nextLine()+" ",w="",s1="";

        for(int x=0;x<s.length();x++)
        {
            char ch=s.charAt(x);
            if(ch!=' ')
            {
                w=ch+w;
            }
            else 
            {
                s1=s1+w+ch;
                w="";
            }
        }
        System.out.println(s1.trim());
    }
}