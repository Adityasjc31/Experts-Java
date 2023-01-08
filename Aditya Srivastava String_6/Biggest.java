import java.util.*;
class Biggest
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any String");
        String s =sc.nextLine()+" ",w="",b="";
        for(int x=0;x<s.length();x++)
        {
            char ch=s.charAt(x);
            if(ch!=' ')
            {
                w=w+ch;
            }
            else
            {
                if(w.length() > b.length())
                {
                    b=w;
                }
                w="";
            }
        }
        System.out.println("Longest Word is "+b+"\nIts Length is "+b.length());
    }
}