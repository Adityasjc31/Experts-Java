import java.util.*;
public class Caesar_Cipher
{
    private String str;
    private int len;
    private String converted="";
    public Caesar_Cipher(String str)
    {
        this.str = str;
        len = str.length();
    }

    public boolean testValidity()
    {
        return !(len > 3 && len<100) ; 
    }

    public boolean converter13()
    {
        if(testValidity())
        {
            return false;
        }
        for(int x=0;x<len;x++)
        {
            char ch = str.charAt(x);
            if(Character.isUpperCase(ch))
            {
                ch += 13;
                if(ch>'Z')
                {
                    ch-=26;
                }
            }
            else if(Character.isLowerCase(ch))
            {
                ch += 13;
                if(ch>'z')
                {
                    ch = (char)(ch-26);
                }
            }
            converted += ch;
        }
        return true;
    }

    public String getConvertedString()
    {
        return converted;
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String str = sc.nextLine();
        Caesar_Cipher cc = new Caesar_Cipher(str);

        if(cc.converter13())
        {    
            System.out.println(cc.getConvertedString());
        }
        else
        {
            System.out.println("INVALID");
        }

    }
}