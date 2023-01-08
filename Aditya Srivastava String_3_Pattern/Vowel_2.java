import java.util.*;
class Vowel_2
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any String");String s=sc.nextLine().toLowerCase(),w="";
        char ch;
        for(int x=0;x<s.length();x++)
        {
            ch=s.charAt(x);
            if(ch=='a' || ch=='i' || ch=='o' || ch=='u' || ch=='e')
            {
                ch++;
                w=w+ch;
            }
            else
            {
                w=w+ch;
            }
        }
        System.out.print(w);
    }
}