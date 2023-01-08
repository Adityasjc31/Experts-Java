import java.util.*;
class Char
{
    public static void main(String args [])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String");
        String s=sc.nextLine();
        int l=s.length();int c1=0,c2=0,c3=0,c4=0;
        for(int i=0;i<l;i++)
        {
            char ch=s.charAt(i);
            if(Character.isUpperCase(ch))
            {
                c1++;
            }
            else if(Character.isLowerCase(ch))
            {
                c2++;
            }
            else if(Character.isDigit(ch))
            {
                c3++;
            }
            else 
            {
                c4++;
            }
        }
        System.out.println("Uppercase Alphabet="+c1);
        System.out.println("Lowercase Alphabet="+c2);
        System.out.println("Digits="+c3);
        System.out.println("Special Character="+c4);
    }
}