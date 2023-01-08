import java.util.*;
class Captial
{
    public static void main(String args [])
    {
        Scanner sc=new Scanner(System.in);
        int c=0;
        System.out.println("Enter a String ");
        String s=sc.nextLine();
        int l=s.length();
        for(int x=0;x<l;x++)
        {
            char ch=s.charAt(x);
            if(ch>='A' && ch<='Z')
            {
                c++;
            }
        }
        System.out.println("Total Captial  letters in "+s+" are : "+c);
    }
}