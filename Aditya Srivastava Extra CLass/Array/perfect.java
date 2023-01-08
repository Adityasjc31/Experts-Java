package Array;

import java.util.*;
class perfect
{
    void sum(int a[])
    {  
        boolean check=true;
        int p[]=new int[a.length];
        int m=0;
        for(int x=0;x<a.length;x++)
        {
            int sum=0;
            for(int y=a[x];y<a[x]/2;y++)
            {
                if(a[x]%y==0)
                {

                }
                if(a[x]==sum)
                {
                    p[m]=a[x];
                    m++;
                }
            }
        }
        for(int x=0;x<=m;x++)
        {
            System.out.print(p[x]);
            if(x<m-1)
            {
                System.out.print(",");
            }
        }
    }

    public static void main(String args [])
    {
        Scanner sc=new Scanner(System.in);
        int a[]=new int[5];
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
        perfect ob=new perfect();
        ob.sum(a);
    }
}