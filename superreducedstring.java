import java.util.Scanner;

class superreducedstring 
{
    public static String superReducedString(String word) {
        word = word + " ";
        String ret = "";
        boolean isReduceable = false;
        for (int x = 0; x < word.length()-1; x++) {
            char ch1 = word.charAt(x);
            char ch2 = word.charAt(x + 1);
            if(ch1 != ch2)
            {
                ret += ch1;
            }
            else
            {
                x++;
                isReduceable = true;
            }
        }
        if(!isReduceable)
        {
            return ret;
        }
        else
        {
            return ret.length() == 0 ? "Empty String" : superReducedString(ret);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string : ");
        String word = sc.next();
        System.out.println("Supper reduced string : ");
        System.out.println(superReducedString(word));
        sc.close();
    }
}