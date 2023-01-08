package Array;

import java.util.*;
class Palindrome
{
    void sum(int a[])
    {  
        boolean check=true;
        for(int x=0;x<a.length;x++)
        {
            int r=0;
            for(int c=a[x];c!=0;c = c/10)
            {
                int d=c%10;
                r=(r*10)+d;
            }
            if(r!=a[x])
            {
                check=false;
                break;
            }
        }
        if(check == true)
        {
            System.out.println("All Numbers are Palindrome ");
        }
        else
        {
            System.out.println("One or more Numbers are not Palindrome");
        }
    }

    public static void main(String args [])
    {
        Scanner sc=new Scanner(System.in);
        int a[]=new int[10];
        for(int x=0;x<a.length;x++)
        {
            System.out.println("Enter Number "+(x+1));int p=sc.nextInt();            
            a[x]=p;
            String nikalo=sc.nextLine();
        }
        System.out.println("Entered Number are : ");
        for(int x=0;x<a.length;x++)
        {
            System.out.print(a[x]);
            if(x<a.length-1)
            {
                System.out.print(",");
            }
        }
        System.out.println("");
        Palindrome ob=new Palindrome();
        ob.sum(a);
    }
}