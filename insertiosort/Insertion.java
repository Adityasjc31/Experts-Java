package insertiosort;

import java.util.*;
class Insertion
{
    public static void main(String args [])
    {
        int ar[]={10,20,30,40,50,60,70,80,90,0};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number");int n=sc.nextInt();
        sc.close();
        int i=ar.length-1;
        while(ar[i-1]>n)
        {
            ar[i]=ar[i-1];
            i--;
            if(i==0){break;}
        }
        ar[i]=n;
        for(int x=0;x<ar.length;System.out.print(ar[x]+"\t"),x++);
    }
}