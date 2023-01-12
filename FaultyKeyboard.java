import java.util.*;
class FaultyKeyboard
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        //System.out.println("Enter the line(1<=T<=10⁴ && a-z && 0-9)");
        String T = sc.nextLine();
        //System.out.println("Enter missing key(1<=S<=16 && a-z && 0-9)");
        String S = sc.next();
        if(T.length()>=1 && T.length()<=(int)(Math.pow(10,4)) && S.length()>=1 && S.length()<=16 && validValue(T,1,10000) && validValue(S,48,57))
        {
            System.out.println("Condition does not meet");
            return ;
        }
        char keys[] = S.toCharArray();
        int op=0;
        String words[] = T.split(" ");
        String test = "";
        for(int y=0;y<words.length;y++)
        {
            if(words[y].indexOf(S)>-1)
            {
                op++;
            }
            else
            {
                test += words[y] + " ";
            }
        }
        test = test.trim();
        for(int x=0;x<keys.length;x++)
        {
            for(int y=0;y<test.length();y++)
            {
                char ch = test.charAt(y);
                int t=0;
                if(ch == keys[x])
                {
                    t = t + ((x+1) * 2);
                    op+=t;
                }
            }
        }
        System.out.println(op);
    }	

    public static boolean validValue(String test,int r1,int r2)
    {
        for(int x=0;x<test.length();x++)
        {
            char ch = test.charAt(x);
            if(!(ch>=r1 && ch<=r2))
            {
                return false;
            }
        }
        return true;
    }
}