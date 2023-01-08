import java.util.*;
class Smallest
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any String");
        String s =sc.nextLine(),w="",b=s;
        s=s+" ";
        for(int x=0;x<s.length();x++)
        {
            char ch=s.charAt(x);
            if(ch!=' ')
            {
                w=w+ch;
            }
            else
            {
                if(w.length() < b.length())
                {
                    b=w;
                }
                w="";
            }
        }
        System.out.println("Shortest Word is "+b+"\nIts Length is "+b.length());
    }
}