import java.util.*;
class Combine_Array
{
    public static void main(String args [])
    {
        Scanner sc=new Scanner(System.in);
        int ar1[]=new int[10];
        int ar2[]=new int[ar1.length];

        for(int x=0;x<ar1.length;x++)
        {
            System.out.println("Enter Number "+(x+1));ar1[x]=sc.nextInt();
        }

        int i=0;
        for(int x=0;x<ar1.length;x++)
        {
            if(ar1[x]>0)
            {
                ar2[i++]=ar1[x];
            }
        }

        for(int x=0;x<ar1.length;x++)
        {
            if(ar1[x]<0)
            {
                ar2[i++]=ar1[x];
            }
        }

        System.out.println("Original Array");
        for(int x=0;x<ar1.length;x++)
        {
            System.out.print(ar1[x]+"\t");
        }
        
        System.out.println("\nRearranged Array");
        for(int x=0;x<ar2.length;x++)
        {
            System.out.print(ar2[x]+"\t");
        }
    }
}