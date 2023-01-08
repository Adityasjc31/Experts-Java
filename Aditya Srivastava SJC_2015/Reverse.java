import java.util.*;
class Reverse
{
    public static void main(String args [])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence");
        String s=sc.nextLine()+" ",n="",w="";
        for(int x=0;x<s.length();x++)
        {
            char ch=s.charAt(x);
            if(ch!=' ')
            {
                n=ch+n;
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