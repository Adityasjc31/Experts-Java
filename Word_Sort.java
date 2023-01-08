import java.util.*;
public class Word_Sort
{
    public static void sort(String ar[])
    {
        for(int x=0;x<ar.length-1;x++)
        {
            int i = x;
            for(int y=x+1;y<ar.length;y++)
            {
                int l1 = ar[y].length();
                int l2 = ar[i].length();
                if(l1<l2)
                {
                    i=y;
                }
                if(l1==l2)
                {
                    if(ar[y].compareToIgnoreCase(ar[i])<0)
                    {
                        i=y;
                    }
                }
            }
            String t = ar[x];
            ar[x] = ar[i];
            ar[i] = t;
        }
    }
    
    public static String[] stringToWordArray(String sent,String delimiter)
    {
        StringTokenizer st = new StringTokenizer(sent,delimiter);
        String ar[] = new String[st.countTokens()];
        for(int x=0;x<ar.length;x++)
        {
            ar[x] = st.nextToken();
        }
        return ar;
    }
    
    public static void display(String ar[])
    {
        String display="";
        for(int x=0;x<ar.length;x++)
        {
            display += ar[x] + " ";
        }
        System.out.println(display.trim());
    }
    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter sentence");
        String s = sc.nextLine();
        char ch = s.charAt(s.length()-1);
        if(!(ch=='?' || ch=='!' || ch=='.'))
        {
            System.out.println("INVALID INPUT");
            return ;
        }
        String ar[]  = stringToWordArray(s,".!? ");
        sort(ar);
        display(ar);
    }
}