package prelims;

import java.util.*;
class Captial
{
    String sent;
    int freq;
    Captial()
    {
        sent=null;
        freq=0;
    }
    
    void input()
    {
        Scanner sc = new Scanner(System.in);
        //Entering a sentence
        System.out.println("Enter a sentence");
        sent = new Scanner(System.in).nextLine();
    }
    
    boolean isCap(String w)
    {
        return Character.isUpperCase(w.charAt(0));
    }
    
    void display()
    {
        String t="";
        String s = sent+" ";
        for(int x=0;x<s.length();x++)
        {
            char ch = s.charAt(x);
            if(ch == ' ')
            {
                if(isCap(t))
                {
                    //Calculating the frequency
                    freq++;
                }
                t="";
            }
            else
            {
                t = t+ch;
            }
        }
        //Displaying the frequency
        System.out.println("Frequency of words starting with captial letter : "+freq);
    }
    
    public static void main(String args[])
    {
        Captial c = new Captial();
        c.input();
        c.display();
    }
}