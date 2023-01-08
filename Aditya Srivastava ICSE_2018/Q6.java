import java.util.*;
class Q6
{
    public static void main(String args [] )
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any String");
        String s =" "+ sc.nextLine().toLowerCase().trim(),n="";
        for(int x=0;x<s.length()-1;x++)
        {
            char ch=s.charAt(x);
            char ch1=s.charAt(x+1);
            if(ch==' ')
            {
                ch1=Character.toUpperCase(ch1);
            }
            n+=ch1;
        }
        
        System.out.println(n);
    }
}