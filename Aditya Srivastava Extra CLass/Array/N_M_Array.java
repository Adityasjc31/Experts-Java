package Array;

import java.util.*;
class N_M_Array
{
    void sum(int a[],int b[],int u)
    {
        int o,c[]=new int[u*2];
        for(o=0;o<u;o++)
        {
            c[o]=a[o];
        }
        int m=0;
        for(int x=o;x<u*2;x++)
        {	
            c[x]=b[m];
            if(m<u)
            {
                m++;
                if(m>=u)
                {
                    break;
                }
            }
        }
        int temp;
        for(int x=0;x<c.length-1;x++)
        {
            for(int h=0;h<c.length-x-1;h++)
            {
                if(c[h]>c[h+1])
                {
                    temp=c[h];
                    c[h]=c[h+1];
                    c[h+1]=temp;
                }
            }
        }
        System.out.println("Merged Elements are : ");
        for(int x=0;x<c.length;x++)
        {
            System.out.print(c[x]);
            if(x<c.length-1)
            {
                System.out.print(",");
            }
        }
    }

    public static void main(String args [])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Entered the Number of Elements");int e=sc.nextInt();
        int A[]=new int[e];
        System.out.println("Enter Number for First Array");
        for(int x=0;x<A.length;x++)
        {
            System.out.println("Enter Number "+(x+1));int p=sc.nextInt();            
            A[x]=p;
            String nikalo=sc.nextLine();
        }
        int B[]=new int[e];
        System.out.println("Enter Number for Second Array");
        for(int x=0;x<B.length;x++)
        {
            System.out.println("Enter Number "+(x+1));int p=sc.nextInt();            
            B[x]=p;
            String nikalo=sc.nextLine();
        }
        System.out.println("Entered Number for First Array");
        for(int x=0;x<A.length;x++)
        {
            System.out.print(A[x]);
            if(x<A.length-1)
            {
                System.out.print(",");
            }
        }
        System.out.println("");
        System.out.println("Entered Number for Second Array");
        for(int x=0;x<B.length;x++)
        {
            System.out.print(B[x]);
            if(x<B.length-1)
            {
                System.out.print(",");
            }
        }
        System.out.println("");
        N_M_Array ob=new N_M_Array();
        ob.sum(A,B,e);
    }
}