import java.util.*;
class Consecutive_2
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any String");
        String s =sc.nextLine()+" ",w="";int c=0;
        for(int x=0;x<s.length();x++)
        {
            char ch=s.charAt(x);
            if(ch!=' ')
            {
                w=w+ch;
            }
            else
            {
                for(int y=0;y<w.length()-1;y++)
                {
                    char ch1=w.charAt(y);
                    char ch2=w.charAt(y+1);
                    if((int)(ch2)-(int)(ch1)==1)
                    {
                        c++;
                    }
                }
            }
        }
        System.out.println(c+" Consecutive Alphabet");
    }
}