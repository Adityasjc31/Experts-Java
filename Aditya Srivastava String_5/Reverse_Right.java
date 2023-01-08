import java.util.*;
class Reverse_Right
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any String");
        String s =" "+sc.nextLine(),n="";

        for(int x=s.length()-1;x>=0;x--)
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