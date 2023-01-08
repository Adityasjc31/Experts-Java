import java.util.*;
class Piglatin
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any String");
        String s =sc.nextLine().toUpperCase(),w="";

        for(int x=0;x<s.length();x++)
        {
            char ch=s.charAt(x);
            if(ch=='A' || ch=='I' || ch=='O' || ch=='E' || ch=='U')
            {
                w=s.substring(x)+s.substring(0,x)+"AY";
                break;
            }
        }
        System.out.println(w);
    }
}