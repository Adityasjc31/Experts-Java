package Array;

import java.util.*;
class Storage
{
    public static void sum(int a1[],int a2[],int u)
    {
        int s=0;
        for(int x=0;x<u;x++)
        {
            s=s+a1[x]+a2[x];
        }
        System.out.println("Sum of First Array And Second array="+s);
    }

    public static void main(String args [])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Entered the Number of Elements");int e=sc.nextInt();
        int a[]=new int[e];
        System.out.println("Enter Number for First Array");
        for(int x=0;x<a.length;x++)
        {
            System.out.println("Enter Number "+(x+1));int p=sc.nextInt();            
            a[x]=p;
            String nikalo=sc.nextLine();
        }
        int b[]=new int[e];
        System.out.println("Enter Number for Second Array");
        for(int x=0;x<b.length;x++)
        {
            System.out.println("Enter Number "+(x+1));int p=sc.nextInt();            
            b[x]=p;
            String nikalo=sc.nextLine();
        }
        System.out.print("\f");
        System.out.println("Given numbers for first Array : ");
        for(int x=0;x<a.length;x++)
        {
            System.out.print(a[x]);
            if(x<a.length-1)
            {
                System.out.print(",");
            }
        }
        System.out.println("");
        System.out.println("Given numbers for Second Array : ");
        for(int x=0;x<b.length;x++)
        {
            System.out.print(b[x]);
            if(x<b.length-1)
            {
                System.out.print(",");
            }
        }
        Storage ob=new Storage();
        System.out.println("");
        ob.sum(a,b,e);
    }
}