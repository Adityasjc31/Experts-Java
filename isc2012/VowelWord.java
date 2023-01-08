package isc2012;

import java.util.*;
class VowelWord
{
    String str;
    int freq;
    VowelWord()
    {
        str=null;
        freq=0;
    }

    void readstr()
    {
        System.out.println("Enter a sentence");
        str = new Scanner(System.in).nextLine();
    }

    void freq_vowel()
    {
        String s = " " + str.trim();
        s = s.toLowerCase();
        for(int x=0;x<s.length();x++)
        {
            int i = s.indexOf(' ',x);
            if(i==-1)
            {
                break;
            }
            char ch = s.charAt(i+1);
            if(ch=='a'|| ch=='e' || ch=='i' || ch=='o' || ch=='u')
            {
                freq++;
            }
            x=i+1;
        }
    }

    void display()
    {
        System.out.println("Sentence : "+str);
        System.out.println("Frequency of vowels : "+freq);
    }

    public static void main(String args[])
    {
        VowelWord ob = new VowelWord();
        ob.readstr();
        ob.freq_vowel();
        ob.display();
    }
}