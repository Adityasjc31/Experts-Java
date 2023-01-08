package ISC_2004;

import java.util.*;
class Decoding_Alphabets_and_Spaces
{
    public static void main(String args[])
    {
        System.out.print("ENCODED MESSAGE : ");
        String s=new Scanner(System.in).next();
        String decode_string="";
        for(int x=s.length()-1;x>=0;x--)
        {
            char ch1=s.charAt(x);
            if(x>0)
            {
                --x;
            }    
            char ch2=s.charAt(x);
            int ascii_code=Integer.parseInt((ch1-48)+""+(ch2-48));
            if((ascii_code>=65 && ascii_code<=90) || (ascii_code>=97 && ascii_code<=122) || ascii_code==32)
            {
                decode_string+=(char)ascii_code;
            }
            else
            {
                if(x>0)
                {
                    --x;
                }    
                char ch3=s.charAt(x);
                ascii_code=Integer.parseInt((ch1-48)+""+(ch2-48)+(ch3-48));
                if((ascii_code>=65 && ascii_code<=90) || (ascii_code>=97 && ascii_code<=122))
                {
                    decode_string+=(char)ascii_code;
                }
            }
        }
        System.out.println("THE DECODED MESSAGE : "+decode_string);
    }
}