import java.util.*;
public class Potential
{
    public static int getPotential(String word)
    {
        int potential = 0;
        for(int x=0;x<word.length();x++)
        {
            char ch = word.charAt(x);
            potential += ch;
        }
        return potential;
    }
    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence");
        String sent = sc.nextLine().toUpperCase();
        char tch = sent.charAt(sent.length()-1);
        if(tch == '?' || tch=='.' || tch=='!')
        {
            StringTokenizer st = new StringTokenizer(sent,"!.? ");
            int count = st.countTokens();
            String w[] = new String[count];
            int p[] = new int[count];
            for(int x=0;x<count;x++)
            {
                w[x] = st.nextToken();
                p[x] = getPotential(w[x]);
                System.out.println(w[x] + "=" + p[x]);
            }
            
            for(int x=0;x<=count-2;x++)
            {
                for(int y=0;y<=count-2;y++)
                {
                    if(p[y] > p[y+1])
                    {
                        int t1 = p[y];
                        p[y] = p[y+1];
                        p[y+1] = t1;
                        
                        String t2 = w[y];
                        w[y] = w[y+1];
                        w[y+1] = t2;
                    }
                }
            }
            
            for(int x=0;x<count;x++)
            {
                System.out.print(w[x] + " ");
            }
        }
        else
        {
            System.out.println("INVALID INPUT");
        }
    }
}