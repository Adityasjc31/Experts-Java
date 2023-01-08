package Array;

import java.io.*;
class Array_3numbers
{
    public static void three(int arr [])
    {
        int c=0;
        for(int i=0;i<arr.length;i++)
        {
            
            if(arr[i]>=100 && arr[i]<=999)
            {
                c++;
            }
        }
        System.out.println("Three Digits Numbers Are : "+c);
    }

    public static void main(String args [])throws IOException
    {
        int a[] = new int[10];
        InputStreamReader in=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(in);
        for(int i=0;i<a.length;i++)
        {
            System.out.println("Enter a Number");
            String n=br.readLine();
            int n1=Integer.parseInt(n);
            a[i]=n1;
        }
        System.out.print("\f");
        System.out.println("Given Data : ");
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+",");
        }
        System.out.println("");
        Array_3numbers ob=new Array_3numbers();
        ob.three(a);
    }
}