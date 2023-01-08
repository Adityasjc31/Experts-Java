package Array;

import java.util.*;
class Item
{
    public static void pr(String arr[],int pri[])
    {
        int c=-1;
        for(int x=0;x<arr.length;x++)
        {
            c++;
            if(pri[x]<50)
            {
                System.out.println(arr[x]);
            }
            
        }
    }

    public static void main(String args [])
    {
        Scanner sc=new Scanner(System.in);
        int ar[]=new int[15];
        String it[]=new String[15];
        for(int x=0;x<ar.length;x++)
        {
            System.out.println("Enter name of "+(x+1)+" item");String i=sc.nextLine();
            System.out.println("Enter the price of "+(x+1)+" item");int p=sc.nextInt();
            ar[x]=p;it[x]=i;
            String nikalo=sc.nextLine();
        }
        System.out.print("\f");
        System.out.println("Item names : ");
        for(int x=0;x<it.length;x++)
        {
            System.out.print(it[x]);
            if(x<it.length-1)
            {
                System.out.print(",");
            }
        }
        System.out.println("");
        System.out.println("Item price respectively : ");
        for(int x=0;x<ar.length;x++)
        {
            System.out.print(ar[x]);
            if(x<it.length-1)
            {
                System.out.print(",");
            }
        }
        System.out.println("\n");
        Item ob=new Item();
        ob.pr(it,ar);
    }
}