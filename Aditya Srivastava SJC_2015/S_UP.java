import java.util.*;
class S_UP
{
    public static void main(String args [])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string in Uppercase Alphabets");
        String s=sc.nextLine();
        System.out.println("Alphabet\tFrequency");
        for(char x='A' ; x<='Z' ; x++)
        {
            int c=0;
            for(int y=0;y<s.length();y++)
            {
                if(s.charAt(y)==x)
                {
                    c++;
                }
            }
            if(c!=0)
            System.out.println(x+"\t\t"+c);
        }
    }
}