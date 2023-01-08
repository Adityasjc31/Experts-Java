import java.util.*;
class Toggle
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any String");
        String s =sc.nextLine(),n="";
        for(int x=0;x<s.length();x++)
        {
            char ch=s.charAt(x);
            if(Character.isUpperCase(ch))
            {
                n=n+Character.toLowerCase(ch);
            }
            else 
            {
                n=n+Character.toUpperCase(ch);
            }
        }
        
        System.out.println(n);
    }
}