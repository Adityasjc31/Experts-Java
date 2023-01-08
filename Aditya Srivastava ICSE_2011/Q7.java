import java.util.*;
class Q7
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String");
        String s=sc.nextLine();
        s=s.toLowerCase();
        int l=s.length();
        for(int i=0;i<l;i++)
        {
            char ch=s.charAt(i);
            if(ch=='U'||ch=='A'||ch=='I'||ch=='O')
            {
                ch++;
                System.out.print(ch);
            }
            else
            {
                System.out.print(ch);
            }
        }
    }
}