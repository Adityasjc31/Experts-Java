import java.util.*;
class Vowel
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any String");String s=sc.nextLine().toLowerCase();
        for(int x=0;x<s.length();x++)
        {
            char ch=s.charAt(x);
            if(ch=='a' || ch=='i' || ch=='o' || ch=='u' || ch=='e')
            {
                ch++;
            }
            System.out.print(ch);
        }
    }
}