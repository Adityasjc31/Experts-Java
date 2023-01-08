package Array;

import java.io.*;
class postive_negative_zero
{
    public static void three(int arr [])
    {
        int p=0,n=0,z=0;//int aay[]=new int[arr.length];
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<0)
            {
                n++;
            }
            else if(arr[i]>0)
            {
                p++;
            }
            else
            {
                z++;
            }
        }
        System.out.println("Postive Numbers are : "+p);
        System.out.println("Negative Numbers are : "+n);
        System.out.println("Zeros are : "+z);
    }

    public static void main(String args [])throws IOException
    {
        int a[] = new int[10];
        InputStreamReader in=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(in);
        for(int i=0;i<a.length;i++)
        {
            System.out.println("Enter number "+(i+1));
            String n=br.readLine();
            int n1=Integer.parseInt(n);
            a[i]=n1;
        }
        System.out.print("\f");
        System.out.println("Given Postive,Negative Or Zero : ");
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]);
            if(i<(a.length)-1)
            {
                System.out.print(",");
            }
        }
        System.out.println("");
        postive_negative_zero ob=new postive_negative_zero();
        ob.three(a);
    }
}