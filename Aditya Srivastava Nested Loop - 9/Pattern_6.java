import java.util.*;
class Pattern_6
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any character");
        char ch=sc.next().charAt(0);
        System.out.println();
        for(int x=5;x>=1;x--)
        {
            for(int y=x;y>=1;y--)
            {
                System.out.print(ch);
            }
            System.out.println();
        }
    }
}