import java.util.*;
class Pattern_1
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any String");
        String s =sc.nextLine();

        for(int x=1;x<=s.length();x++)
        {
            System.out.println(s.substring(0,x));
        }
    }
}