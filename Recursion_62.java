import java.util.Scanner;
class Recursion_62
{
    public static int countUpperCase(String str)
    {
        if(str.length()== 1)
        {
            return Character.isUpperCase(str.charAt(0)) ? 1 : 0;
        }
        else
        {
            return Character.isUpperCase(str.charAt(0)) ? 1+countUpperCase(str.substring(1)) : countUpperCase(str.substring(1));
        }
    }
    
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any String");
        String str=sc.nextLine();
        int c=countUpperCase(str);
        System.out.println(c+" Uppercase alphabets");
    }    
}