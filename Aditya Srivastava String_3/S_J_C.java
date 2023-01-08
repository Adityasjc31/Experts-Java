import java.util.*;
class S_J_C
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any String");
        String s=" "+sc.nextLine().toUpperCase(),w="";
        for(int x=0;x<s.length()-1;x++)
        {
            if(s.charAt(x)==' ' && s.charAt(x+1)!=' ')
            {
                w=w+s.charAt(x+1)+'.';
            }
        }
        System.out.println(w);
    }
}