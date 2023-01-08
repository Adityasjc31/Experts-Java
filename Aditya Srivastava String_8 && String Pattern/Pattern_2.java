import java.util.*;
class Pattern_2
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any String");
        String s =sc.nextLine();

        for(int x=s.length();x>=1;x--)
        {
            System.out.println(s.substring(0,x));
        }
    }
}