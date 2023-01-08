package Array;

import java.util.*;
class check_postive
{
    public static void pr(int pri[])
    {
        int u=0;
        for(int x=0;x<pri.length;x++)
        {
            if(pri[x]>0)
            {
                u++;
                break;
            }
        }
        if(u>0 && u==pri.length)
        {
            System.out.println("Entered numbers are postive");
        }
        else
        {
            System.out.println("One or more Numbers are negative");
        }
    }

    public static void main(String args [])
    {
        Scanner sc=new Scanner(System.in);
        int ar[]=new int[10];
        for(int x=0;x<ar.length;x++)
        {
            System.out.println("Enter a number");int p=sc.nextInt();            
            ar[x]=p;
            String nikalo=sc.nextLine();
        }
        System.out.print("\f");
        System.out.print("");int l=0,q=0;
        System.out.println("Given numbers are : ");
        for(int x=0;x<ar.length;x++)
        {
            System.out.print(ar[x]);
            if(x<ar.length-1)
            {
                System.out.print(",");
            }
        }
        check_postive ob=new check_postive();
        System.out.println("");
        ob.pr(ar);
    }
}