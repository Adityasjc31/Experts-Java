package project;

/**ISC 2016 Q9*/
import java.util.*;
class ConsCharge
{
    String word;
    int len;
    ConsCharge()
    {
        word = null;
        len = 0;
    }

    void readword()
    {
        System.out.println("Enter word in lower case");
        //inputing a word
        word = new Scanner(System.in).next();
        len = word.length();
        boolean b = true;
        //checking word that it is in lowerCase or not
        for(int x=0;x<len;x++)
        {
            if(Character.isUpperCase(word.charAt(x)))
            {
                b=false;
                break;
            }
        }

        if(!b)
        {
            System.out.println("Not is right Case");
            word = null;
            return ;
        }
    }

    void shiftcons()
    {
        String w="",vowels="";
        for(char x='a' ;x<='z';x++)
        {
            for(int y=0;y<word.length();y++)
            {
                char ch = word.charAt(y);
                if(ch!='a' && ch!='e' && ch!='i' && ch!='o' && ch!='u')
                {
                    w=w+ch;
                }
                else
                {
                    vowels += ch;
                }
            }
        }
        w=w+vowels;
        System.out.println("Shifted word : "+w);
    }
    
    void changedword()
    {
        String w="",vowels="";
        for(char x='a' ;x<='z';x++)
        {
            for(int y=0;y<word.length();y++)
            {
                char ch = word.charAt(y);
                if(ch!='a' && ch!='e' && ch!='i' && ch!='o' && ch!='u')
                {
                    w=w+ch;
                }
                else
                {
                    vowels += ch;
                }
            }
        }
        w=w.toUpperCase()+vowels;
        System.out.println("Changed word : "+w);
    }
    
    void display()
    {
        //Displaying the original word,shifted word and changed word
        System.out.println("Original Word : "+word);
        shiftcons();
        changedword();
    }
    
    public static void main(String args[])
    {
        ConsCharge cc = new ConsCharge();
        cc.readword();
        cc.display();
    }
}