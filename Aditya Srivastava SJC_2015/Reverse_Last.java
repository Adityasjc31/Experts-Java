import java.util.*;
class Reverse_Last
{
    public static void main(String args [])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence");
        String s=" "+sc.nextLine(),n="",w="";
        for(int x=s.length()-1;x>=0;x--)
        {
            char ch=s.charAt(x);
            if(ch!=' ')
            {
                n=n+ch;
            }
            else
            {
                w=w+n+" ";
                n="";
            }
        }
        System.out.println(w.trim());
    }
}