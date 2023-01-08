import java.util.*;
class S_CH_S_V
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);int c=0;
        System.out.println("Enter any string");
        String s = sc.nextLine().toUpperCase();
        for(int x=0;x<s.length();x++)
        {
            char ch = s.charAt(x);
            if(ch=='A' || ch=='I' || ch=='E' || ch=='O' || ch=='U')
            {
                c++;
            }
        }
        System.out.println(c + " Vowels");
    }
}