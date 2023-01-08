package Array;

import java.util.*;
class players_11
{
    public static void three(String na [] , int arr [])
    {
        Scanner sc=new Scanner(System.in);
        String u;
        for(int x=0;x<arr.length-1;x++)
        {
            for(int h=0;h<arr.length-x-1;h++)
            {
                if(arr[h]>arr[h+1])
                {
                    u=na[h];//System.out.println("\t\t\t\t\tna[h]="+na[h]+"----------\tu="+u+"\tprocess - "+h);
                    na[h]=na[h+1];//System.out.println("\t\t\t\t\tna[h]="+na[h]+"----------\tna[h+1]="+na[x+1]);
                    na[h+1]=u;//System.out.println("\t\t\t\t\tna[h]="+na[h+1]+"----------\tu="+u);
                    //System.out.println("\n");
                    //String n=sc.nextLine();
                }
            }
        }
        System.out.println("Higest Score = "+na[10]);
    }

    public static void main(String args [])
    {
        Scanner sc=new Scanner(System.in);
        int ar[]=new int[11];
        String it[]=new String[11];
        for(int x=0;x<ar.length;x++)
        {
            System.out.println("Enter name of "+(x+1)+" player");String i=sc.nextLine();
            System.out.println("Enter the runs of "+(x+1)+" player");int p=sc.nextInt();
            ar[x]=p;it[x]=i;
            String nikalo=sc.nextLine();
        }
        System.out.print("\f");
        System.out.println("Players run : ");
        for(int x=0;x<it.length;x++)
        {
            System.out.print(it[x]);
            if(x<it.length-1)
            {
                System.out.print(",");
            }
        }
        System.out.println("");
        System.out.println("Runs scored respectively : ");
        for(int x=0;x<ar.length;x++)
        {
            System.out.print(ar[x]);
            if(x<it.length-1)
            {
                System.out.print(",");
            }
        }
        System.out.println("\n");
        players_11 ob=new players_11();
        ob.three(it,ar);
    }
}