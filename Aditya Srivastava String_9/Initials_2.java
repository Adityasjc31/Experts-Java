import java.util.*;
class Initials_2
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any String");
        String s = " "+sc.nextLine().toUpperCase();
        int i=s.lastIndexOf(' ');
        System.out.print(s.charAt(i+1)+s.substring(i+2).toLowerCase());
        for(int x=0;x<i-1;x++)
        {
            char ch=s.charAt(x);
            if(ch==' ')
            {
                System.out.print(s.charAt(x+1)+".");
            }
        }
    }
}