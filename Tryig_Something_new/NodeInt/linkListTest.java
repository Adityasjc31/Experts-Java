package Tryig_Something_new.NodeInt;

import java.util.*;
public class linkListTest
{
    protected static linkedlist S;
    public static void main(String args[])
    {
        S = new linkedlist();
        Scanner sc = new Scanner(System.in);
        System.out.println(".....Starting List Test for INSERTION.....");
        //System.out.println("Enter a number : ");
        //int n = sc.nextInt();
        S.Insert(5,false);
        S.Insert(2,false);
        S.Insert(7,false);
        S.Insert(4,false);
        S.Insert(9,false);
        
        System.out.println("Now list is : ");
        S.display();
        
        //System.out.println("Inserted : "+n);

        /*int n=-2;
        while(n!=-1)
        {
        System.out.println("Enter number to be deleted : ");
        n = sc.nextInt();
        if(n==-1) continue;
        if(S.delete(n))
        {
        System.out.println(n + "deleted successfully");
        }
        else
        {
        System.out.println("Sorry!\nNo such number found in list");
        }
        System.out.println("Now list is : ");
        S.display();
        }*/
        S.sort();
        System.out.println("Sorted");
        System.out.println("Now list is : ");
        S.display();
        System.out.println("----List Test Over----");
    }
}