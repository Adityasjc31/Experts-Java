import java.util.Scanner;
class Recursion_63
{
    public static String allUpperCase(String str)
    {
        if(str.length() == 1)
        {
            return Character.isUpperCase(str.charAt(0)) ? "" + str.charAt(0) : "";
        }
        else
        {
            return Character.isUpperCase(str.charAt(0)) ? str.charAt(0) + allUpperCase(str.substring(1)) : allUpperCase(str.substring(1));
        }
    }
    
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any String");
        String str=sc.nextLine();
        String uc=allUpperCase(str);
        System.out.println("Uppercase alphabets are "+uc);
    }
}