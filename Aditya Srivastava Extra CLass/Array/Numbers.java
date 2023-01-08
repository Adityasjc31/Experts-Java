package Array;

import java.util.*;
class Numbers
{
    public static void pr(int pri[])
    {
        Scanner sc=new Scanner(System.in);
        int u;
        for(int x=0;x<pri.length-1;x++)
        {
            //System.out.println("\t\t\t\t\t\tprocess-"+x);
            for(int h=0;h<pri.length-x-1;h++)
            {
                if(pri[h]>pri[h+1])
                {
                    u=pri[h];//System.out.println("\t\t\t\t\t\tpri[h]="+pri[h]+"-----------u="+u);
                    pri[h]=pri[h+1];//System.out.println("\t\t\t\t\t\tpri[h]="+pri[h]+"-----------pri[h+1]="+pri[h+1]);
                    pri[h+1]=u;//System.out.println("\t\t\t\t\t\tpri[h]="+pri[h+1]+"-----------u="+u);
                    //System.out.println("\n");
                }
            }
            //String s=sc.nextLine();
        }
        System.out.println("Average of biggest and smallest number are = "+((pri[0]+pri[pri.length-1])/2.0));
    }

    public static void main(String args [])
    {
        Scanner sc=new Scanner(System.in);
        int ar[]=new int[5];
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
        Numbers ob=new Numbers();
        System.out.println("");
        ob.pr(ar);
    }
}