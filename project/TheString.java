package project;

/**ISC - 2015 Q10*/

import java.util.*;
class TheString
{
    String str;
    int len,wordcount,cons;

    //default Constructor
    TheString()
    {
        str = null;
        len=wordcount=cons=0;
    }

    //Parameterized Constructor
    TheString(String ds)
    {
        str=ds;
        len = str.length();
        wordcount=cons=0;
    }
    
    //Counting Frequency of consonants and words
    void countFreq()
    {
        String s=str.toLowerCase();
        for(int x=0;x<len;x++)
        {
            char ch = s.charAt(x);

            if(ch!=' ')
            {
                if( ch!='a' && ch!='e' && ch!='i' && ch!='o' && ch!='u')
                {
                    cons++;
                }
            }
            else
            {
                wordcount++;
            }
        }
    }

    void display()
    {
        System.out.println("Original sentence : "+str);
        System.out.println("Number of words : "+(wordcount+1));
        System.out.println("Number of consonants : "+cons);
    }

    public static void main(String args[])
    {
        TheString x = new TheString("India is my Country");
        x.countFreq();
        x.display();
    }
}