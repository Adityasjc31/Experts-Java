import java.util.*;
class Duplicate
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any word");
        String s =sc.next().toUpperCase();
        for(int x=0;x<s.length();x++)
        {
            char ch = s.charAt(x);
            boolean f=false;
            for(int y=0;y<x;y++)
            {
                if(s.charAt(y)==ch)
                {
                    f=true;
                }
            }
            
            if(f==false)
            {
                System.out.print(ch);
            }
        }
    }
}