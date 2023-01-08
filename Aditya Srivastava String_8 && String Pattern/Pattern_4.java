import java.util.*;
class Pattern_4
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any String");
        String s =sc.nextLine();
        for(int x=s.length();x>=0;x--)
        {
            System.out.println(s.substring(0,x));
        }
    }
}