import java.util.*;
public class StrSubset
{
    static String subset[];
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        //System.out.println("N : ");
        int N = sc.nextInt();
        //System.out.println("Rank to be found : ");
        int R = sc.nextInt();
        //System.out.println("String : ");
        String str = sc.next();
        StringTokenizer st = new StringTokenizer(str,",");
        subset = new String[(int)Math.pow(2,st.countTokens())];
        subset[0]="";
        for(int x=1;x<=N;x++)
        {
            subset[x] = st.nextToken();
        }

        for(int x=1;x<N;x++)
        {
            for(int y=x+1;y<(N+x);y++)
            {
                String t = subset[x]+","+subset[y];
                subset[y+N-1+(x-1)] = t;
            }
        }

        subset[subset.length-1] = str;

        //System.out.print("At rank "+R+" : ");
        System.out.println(subset[R-1]);
    }
}