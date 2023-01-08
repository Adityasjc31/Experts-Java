package prelims;

import java.util.*;
class Rearrange
{
    String wrd,newwrd;
    Rearrange()
    {
        wrd=null;
        newwrd=null;
    }
    
    void readword()
    {
        //Inputing a word
        System.out.println("Enter a word");
        wrd = new Scanner(System.in).next().toUpperCase();
    }
    
    void freq_vow_con()
    {
        //Calculating the frequencies of vowel
        int vow=0,con=0;
        for(int x=0;x<wrd.length();x++)
        {
            char ch = wrd.charAt(x);
            if(ch=='U' || ch=='A' || ch=='E' || ch=='I' || ch=='O')
            {
                vow++;
            }
            else
            {
                con++;
            }
        }
        //Displaying the frequency of vowels
        System.out.println("Frequency of vowels : "+vow);
        System.out.println("Frequency of consonants : "+con);
    }
    
    void arrange()
    {
        String vow="",con="";
        for(int x=0;x<wrd.length();x++)
        {
            char ch = wrd.charAt(x);
            if(ch=='U' || ch=='A' || ch=='I' || ch=='O' || ch=='U')
            {
                vow+=ch;
            }
            else
            {
                con+=ch;
            }
        }
        newwrd = vow+con;
    }
    
    void display()
    {
        System.out.println("Original Word : "+wrd);
        System.out.println("Rearranged Word : "+newwrd);
    }
    
    public static void main(String args[])
    {
        Rearrange ob = new Rearrange();
        ob.readword();
        ob.freq_vow_con();
        ob.arrange();
        ob.display();
    }
}