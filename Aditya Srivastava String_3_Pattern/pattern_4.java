import java.util.*;
class pattern_4
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any String");
        String s=sc.nextLine();
        for(int x=s.length()-1;x>=0;x--)
        {
            for(int y=s.length()-1;y>=x;y--)
            {
                System.out.print(s.charAt(y));
            }
            System.out.println();
        }
    }
}