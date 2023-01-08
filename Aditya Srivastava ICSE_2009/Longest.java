import java.util.*;
class Longest
{
    public static void main(String args [])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any string");String s = sc.nextLine();
        String w="";int b=0;
        for(int x=0;x<s.length();x++)
        {
            char ch = s.charAt(x);
            if(ch!=' ')
            {
                w=w+ch;
            }
            else
            {
                if(w.length()>b)
                {
                    b=w.length();
                }
            }
        }
        System.out.println("Length Highest : "+b);
    }
}