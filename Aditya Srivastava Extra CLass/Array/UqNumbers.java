package Array;

import java.util.*;
class UqNumbers
{
    public static void pr(int pri[])
    {
        int u;
        for(int x=0;x<pri.length-1;x++)
        {
            for(int h=0;h<pri.length-x-1;h++)
            {
                if(pri[h]>pri[h+1])
                {
                    u=pri[h];
                    pri[h]=pri[h+1];
                    pri[h+1]=u;
                }
            }
        }
        System.out.println("Sorted Elements");
        for(int x=0;x<pri.length;x++)
        {
            System.out.print(pri[x]);
            if(x<(pri.length-1))
            {
                System.out.print(",");
            }
        }
        System.out.println("");
        int m=0,l=0;
        for(int x=0;x<pri.length;x++)
        {
            if(pri[x]%2==0)
            {
                m++;//System.out.println("\t\t\t\t\tm="+m);
            }
        }
        System.out.println("Sorted even elements");
        int ev[]= new int[m];
        for(int x=0;x<pri.length;x++)
        {
            if(pri[x]%2==0)
            {
                System.out.print(pri[x]);
                ev[l]=pri[x];
                l++;
                if(x<pri.length-1)
                {
                    System.out.print(",");
                }
            }
        }
        System.out.println("");
        if(m!=0)
        {
            System.out.println("Largest Even Number="+ev[m-1]);
        }
        else
        {
            System.out.println("0");
        }
        System.out.println("");
    }

    public static void main(String args [])
    {
        Scanner sc=new Scanner(System.in);
        int ar[]=new int[20];
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
        UqNumbers ob=new UqNumbers();
        System.out.println("");
        ob.pr(ar);
    }
}