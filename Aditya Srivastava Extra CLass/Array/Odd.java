package Array;

import java.util.*;
class Odd
{
    public static void pr(int pri[])
    {
        int sum=0;
        for(int x=0;x<pri.length;x++)
        {
            if(pri[x]%2!=0)
            {
                sum=sum+pri[x];
            }
        }
        System.out.println("Sum of Odd Numbers = "+sum);
    }

    public static void main(String args [])
    {
        Scanner sc=new Scanner(System.in);
        int ar[]=new int[15];
        //String it[]=new String[20];
        for(int x=0;x<ar.length;x++)
        {
            //System.out.println("Enter name of "+(x+1)+" student");String i=sc.nextLine();
            System.out.println("Enter a number");int p=sc.nextInt();            
            ar[x]=p;//it[x]=i;
            String nikalo=sc.nextLine();
        }
        System.out.print("\f");
        /*System.out.println("Students names : ");
        for(int x=0;x<it.length;x++)
        {
        System.out.print(it[x]);
        if(x<it.length-1)
        {
        System.out.print(",");
        }
        }*/
        System.out.print("");
        System.out.println("Odd numbers are : ");
        for(int x=0;x<ar.length;x++)
        {
            if(ar[x]%2!=0)
            {
                System.out.print(ar[x]);
                if(x<ar.length-1)
                {
                    System.out.print(",");
                }
            }
        }
        System.out.println("\n");
        Odd ob=new Odd();
        ob.pr(ar);
    }
}