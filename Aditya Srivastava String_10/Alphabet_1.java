import java.util.*;
class Alphabet_1
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any String");
        String s=sc.nextLine().toUpperCase();
        char ch[]=s.toCharArray();
        for(int x=0;x<s.length()-1;x++)
        {
            for(int y=0;y<s.length()-1-x;y++)
            {
                if(ch[y]>ch[y+1])
                {
                    char t=ch[y];
                    ch[y]=ch[y+1];
                    ch[y+1]=t;
                }
            }
        }
        System.out.println(ch);
    }
}