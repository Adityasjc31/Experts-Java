import java.util.*;
class Arranging_words_in_alphabetical_order
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence(Should Be Separated by Single Space Only)");
        String original_sentence=sc.nextLine().toUpperCase();
        char ch=original_sentence.charAt(original_sentence.length()-1);
        if(!(ch=='.' || ch=='?' || ch=='!'))
        {
            System.out.println("INVALID INPUT");
            return ;
        }
        String ar[]=new String[countWords(original_sentence)];
        Put_words_in_array(ar,original_sentence);
        System.out.println("Original Sentence : "+original_sentence);
        sort(ar);
        System.out.print("Sorted Sentence : ");
        display(ar);
    }
    
    public static void sort(String ar[])
    {
        for(int x=0;x<ar.length;x++)
        {
            int i=x;
            for(int y=x+1;y<ar.length;y++)
            {
                if(ar[i].length()==ar[y].length())
                {
                    if(ar[i].compareToIgnoreCase(ar[y])>0)
                    {
                        String t=ar[i];
                        ar[i]=ar[y];
                        ar[y]=t;
                    }
                }
                else if(ar[i].length()>ar[y].length())
                {
                    i=y;
                }
            }
            String t=ar[i];
            ar[i]=ar[x];
            ar[x]=t;
        }
    }
    
    public static void Put_words_in_array(String ar[],String s)
    {
        s=s+" ";
        int index=-1;
        for(int x=0;x<ar.length;x++)
        {
            int i=s.indexOf(" ",++index);
            String t=s.substring(index,i);
            index=i;
            ar[x]=t;
        }
        ar[ar.length-1]=ar[ar.length-1].substring(0,ar[ar.length-1].length()-1);
    }
    
    public static void display(String ar[])
    {
        for(int x=0;x<ar.length;x++)
        {
            System.out.print(ar[x]+" ");
        }
    }
    
    public static int countWords(String s)
    {
        return new StringTokenizer(s).countTokens();
    }
}