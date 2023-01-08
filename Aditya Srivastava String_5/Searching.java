import java.util.*;
class Searching
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any String");
        String s =" "+sc.nextLine(),n="";
        System.out.println("Enter word to be searched");
        String s2=sc.next();
        int f=0;
        for(int x=0;x<s.length()-1;x++)
        {
            char ch=s.charAt(x);
            if(ch!=' ')
            {
                n=n+ch;
            }
            else 
            {
                if(n.equals(s2))
                {
                    f++;
                }
                n="";
            }
        }
        if(f==0)
        {
            System.out.println("Not Found");
        }
        else 
        {
            System.out.println("Frequency of word "+f);
        }
    }
}