import java.util.*;
class Vowels
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String");
        String s=sc.nextLine();
        s=s.toUpperCase();
        int c=0;
        int l=s.length();
        for(int i=1;i<=(l-1);i++)
        {
            char ch=s.charAt(i);
            if(ch=='U'||ch=='A'||ch=='I'||ch=='O')
            {
                c++;
            }
        }
        System.out.println("Vowels = "+c);
    }
}