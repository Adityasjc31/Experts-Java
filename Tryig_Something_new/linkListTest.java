package Tryig_Something_new;

import java.util.*;
public class linkListTest
{
    protected static LinkList S;
    public static void main(String args[])
    {
        S = new LinkList();
        Scanner sc = new Scanner(System.in);
        System.out.println(".....Starting List Test for INSERTION.....");
        /*for(int a=0;a<5;a++)
        {
            System.out.println("Enter a text : ");
            String n = sc.nextLine();
            S.insert(n,false);
            System.out.println("Inserted : "+n);
        }*/
        S.insert("Aditya Srivastava",false);
        S.insert("is",false);
        S.insert("a",false);
        S.insert("good boy",false);
        S.insert(".",false);
        
        System.out.println("Created list is : ");
        S.display();
        System.out.println("Delimited");
        S.delimiter(" ");
        S.display();
        System.out.println("----List Test Over----");
    }
}