package Array;

import java.util.*;
class Prime
{
    void sum(int a[])
    {
        int c=0;
        for(int x=0;x<a.length;x++)
        {
            if(a[x]%1==0 && a[x]%a[x]==0)
            {
                c++;
            }
        }
        System.out.println("Number of Prime Numbers = "+c);
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
        Prime ob=new Prime();
        ob.sum(a);
    }
}