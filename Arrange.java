import java.util.*;
class Arrange
{
    public static void main(String args[])
    {
        System.out.println("Enter a word or a sentence");
        String s = new Scanner(System.in).nextLine();
        System.out.println(sort(s));
    }

    public static String sort(String s)
    {
        String r="";
        for(char x='A',z='A' ; x<='Z' && x-65<s.length() ;x++)
        {
            char ch=s.charAt(z-65);
            if(ch==x)
            {
                r=r+ch;
                z++;
            }
            boolean b=false;int in=(x-65)+1;
            for(int y=(x-65)+1;y<s.length();y++)
            {
                if(ch==Character.toUpperCase(s.charAt(y)))
                {
                    in=y;
                    b=true;
                    break;
                }
            }
            
            if(b)
            {
                r=r+s.charAt(in);
            }
        }
        return r;
    }
}