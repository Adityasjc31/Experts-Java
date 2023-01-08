import java.util.*;
class Chara
{
    public static void main(String args [])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a character");
        char ch=sc.nextLine().charAt(0);
        if(Character.isUpperCase(ch))
        {
            System.out.println("Uppercase Alphabet");
        }
        else if(Character.isLowerCase(ch))
        {
            System.out.println("Lowercase Alphabet");
        }
        else if(Character.isDigit(ch))
        {
            System.out.println("Digit");
        }
        else 
        {
            System.out.println("Special Character");
        }
    }
} 