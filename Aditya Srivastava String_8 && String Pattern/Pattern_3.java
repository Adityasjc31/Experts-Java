import java.util.*;
class Pattern_3
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any String");
        String s =sc.nextLine();
        for(int x=s.length()-1;x>=0;x--)
        {
            System.out.println(s.substring(x,s.length()));
        }
    }
}