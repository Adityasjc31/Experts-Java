import java.util.*;
class Length_2
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any String");
        String s =" "+sc.nextLine(),n="";
        for(int x=0;x<s.length()-1;x++)
        {
            char ch=s.charAt(x);
            if(ch!=' ')
            {
                n=n+ch;
            }
            else 
            {
                if(n.length()==2)
                {
                    System.out.println(n);
                }
                n="";
            }
        }
    }
}