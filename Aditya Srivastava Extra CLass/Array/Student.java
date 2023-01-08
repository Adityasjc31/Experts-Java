package Array;

import java.util.*;
class Student
{
    public static void pr(String arr[],int pri[])
    {
        int c=-1;int b=0,m=0;String aay[]=new String[pri.length];String ayy[]=new String[pri.length];
        for(int x=0;x<arr.length;x++)
        {
            if(pri[x]>=80)
            {
                aay[b]=arr[x];
                b++;
            }
            else if(pri[x]<40)
            {
                ayy[m]=arr[x];
                m++;
            }
        }
        System.out.println("Students getting 80 or above : ");
        for(int x=0;x<b;x++)
        {
            System.out.print(aay[x]);
            if(x<(b-1))
            {
                System.out.println(",");
            }
        }
        System.out.println("");
        System.out.println("Students getting below 40 : ");
        for(int x=0;x<m;x++)
        {
            System.out.print(ayy[x]);
            if(x<(m-1))
            {
                System.out.println(",");
            }
        }
        System.out.println("");
    }

    public static void main(String args [])
    {
        Scanner sc=new Scanner(System.in);
        int ar[]=new int[20];
        String it[]=new String[20];
        for(int x=0;x<ar.length;x++)
        {
            System.out.println("Enter name of "+(x+1)+" student");String i=sc.nextLine();
            System.out.println("Enter the marks of "+(x+1)+" student");int p=sc.nextInt();
            ar[x]=p;it[x]=i;
            String nikalo=sc.nextLine();
        }
        System.out.print("\f");
        System.out.println("Students names : ");
        for(int x=0;x<it.length;x++)
        {
            System.out.print(it[x]);
            if(x<it.length-1)
            {
                System.out.print(",");
            }
        }
        System.out.println("");
        System.out.println("Students Marks respectively : ");
        for(int x=0;x<ar.length;x++)
        {
            System.out.print(ar[x]);
            if(x<it.length-1)
            {
                System.out.print(",");
            }
        }
        System.out.println("\n");
        Student ob=new Student();
        ob.pr(it,ar);
    }
}