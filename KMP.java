public class KMP {
    public static int[] computePrefixFunction(String pref)
    {
        char P[]=pref.toCharArray();
        int m = P.length;
        int pi[] = new int[m];
        pi[0] = -1;
        int k = -1;
        for(int q=1;q<m;q++)
        {
            while (k>-1 && P[k+1]!=P[q]) {
                k = pi[k];
            }
            if (P[k+1] == P[q]) {
                k++;
            }
            pi[q] = k;
        }
        return pi;
    }
    public static void kmpMatcher(String T,String P)
    {
        int n = T.length();
        int m = P.length();
        int pi[] = computePrefixFunction(P);
        int q = -1;
        for (int i=0;i<n;i++)
        {
            while (q>-1 && P.charAt(q+1)!= T.charAt(i)) {
                q = pi[q];
            }

            if(P.charAt(q+1) == T.charAt(i))
            {
                q = q+1;
            }
            if (q==(m-1))
            {
                System.out.println("Pattern occurs within shift : "+(i-m+1)+" to "+(m+(i-m+1)));
                q = pi[q];
            }
        }
    }

    public static void printArray(char text[],int val[])
    {
        for (int i = 0; i < text.length; i++) {
            System.out.print(text[i]+" ");
        }
        System.out.println();
        for (int i = 0; i < val.length; i++) {
            System.out.print(val[i]+" ");
        }
    }

    public static void main(String[] args) {
        String P = "ab";
        String T = "ababababcacbababababca";
        // int res[] = computePrefixFunction(P);
        // printArray(P.toCharArray(), res);
        kmpMatcher(T, P);
    }
}
