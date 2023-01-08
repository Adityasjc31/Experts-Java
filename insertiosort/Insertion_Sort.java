package insertiosort;

import java.util.*;
class Insertion_Sort
{
    public static void Insertion(int ar[],int n)
    {
        int i=ar.length-1;
        while(ar[i-1]>n)
        {
            ar[i]=ar[i-1];
            
            if(i==0){break;}
        }
        ar[i]=n;
    }
    static int ar[] = new int[5];
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        for(int x=0;x<ar.length;x++)
        {
            System.out.println("Enter number at index "+x);ar[x]=sc.nextInt();
        }
        for(int x=1;x<ar.length;x++)
        {
            int i=0;
            int car[]=new int[x+1];
            for(int y=0;y<car.length;y++)
            {
                car[y]=ar[i++];
            }
            Insertion(car,ar[x]);
            i=0;
            for(int y=0;y<car.length;y++)
            {
                ar[i++]=car[y];
            }
        }
        for(int x=0;x<ar.length;System.out.print(ar[x]+"\t"),x++);
    }
}