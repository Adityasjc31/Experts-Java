import java.util.*;
class Alphabet
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any String");
        String s=sc.nextLine().toUpperCase();
        
        for(char x='A' ; x<='Z' ;x++)
        {
            for(int y=0;y<s.length();y++)
            {
                if(s.charAt(y)== x)
                {
                    System.out.print(x);
                }
            }
        }
    }
}