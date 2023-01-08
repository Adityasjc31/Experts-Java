package project;

import java.util.*;
class Reverse_Word
{
    public static String reverseWord(String n)
    {
        if(n.length()>0)
        {
            char ch=n.charAt(0);
            return reverseWord(n.substring(1))+ch;
        }
        else
        {
            return "";
        }
    }
    
    public static void main(String args[])
    {
        System.out.println("Enter a word");
        String s=new Scanner(System.in).next();
        System.out.println("Reversed Word : "+reverseWord(s));
    }
}