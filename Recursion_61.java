import java.util.Scanner;
class Recursion_61
{

    public static String reverse(String str)
    {
        if(str.length() <=1)
        {
            return str;
        }
        else
        {
            return reverse(str.substring(1)) + str.charAt(0);
        }
    }

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any String");
        String str=sc.nextLine();
        String rev=reverse(str);
        System.out.println("Reverse = "+rev);
    }
}