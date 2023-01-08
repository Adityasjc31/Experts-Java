import java.util.*;
class Develop
{
    public static void main(String args [])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any string");
        String s=sc.nextLine();
        if(Pal_String.b(s))
        {
            System.out.println("Palindrome String");
        }
        else
        {
            System.out.println("Not a Palindrome String");
        }
    }
}