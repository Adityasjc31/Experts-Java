package ISC_2003;

import java.util.*;
class Decryption
{
    public static void main(String args [])
    {
        System.out.print("CODED TEXT : ");
        String s=new Scanner(System.in).nextLine().toUpperCase();
        s=s.replaceAll(" ","");
        System.out.print("SHIFT : ");
        int n=new Scanner(System.in).nextInt();
        String r="";
        n--;
        for(int x=0;x<s.length();x++)
        {
            char ch=s.charAt(x);
            ch=(char)(ch+n);
            if(ch>90)
            {
                ch=(char)(ch-90+64);
            }
            r=r+ch;
        }
        r=r.replaceAll("QQ"," ");
        System.out.println("DECODED TEXT : "+r);
    }
}