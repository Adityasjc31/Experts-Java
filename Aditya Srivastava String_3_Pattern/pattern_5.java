import java.util.*;
class pattern_5
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any String");
        String s=sc.nextLine();
        for(int x=0;x<s.length();x++)
        {
            for(int y=x;y>=0;y--)
            {
                System.out.print(s.charAt(y));
            }
            System.out.println();
        }
    }
}