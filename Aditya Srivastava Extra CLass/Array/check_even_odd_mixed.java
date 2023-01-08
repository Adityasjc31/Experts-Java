package Array;

import java.util.*;
class check_even_odd_mixed
{
    public static void pr(int pri[])
    {
        int e,o,m;e=o=m=0;
        for(int x=0;x<pri.length;x++)
        {
            if(pri[x]%2==0)
            {
                e++;
            }
            else if(pri[x]%2!=0)
            {
                o++;
            }
            else
            {
                m++;
            }
        }
        if(e==pri.length)
        {
            System.out.println("Entered Numbers are Even");
        }
        else if(o==pri.length)
        {
            System.out.println("Entered Numbers are Odd");
        }
        else
        {
            System.out.println("Enteredd Number are Mixed Numbers");
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
        check_even_odd_mixed ob=new check_even_odd_mixed();
        System.out.println("");
        ob.pr(ar);
    }
}