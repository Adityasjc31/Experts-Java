package Array;

import java.io.*;
class players
{
    public static void three(int arr [])
    {
        int c=0;//int aay[]=new int[arr.length];
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==100)
            {
                c++;
                //aay[i]=c;
            }
        }
        System.out.println("Number of centuries : "+c);
    }

    public static void main(String args [])throws IOException
    {
        int a[] = new int[11];
        InputStreamReader in=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(in);
        for(int i=0;i<a.length;i++)
        {
            System.out.println("Enter runs of player "+(i+1));
            String n=br.readLine();
            int n1=Integer.parseInt(n);
            a[i]=n1;
        }
        System.out.print("\f");
        System.out.println("Given Runs : ");
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]);
            if(i<(a.length)-1)
            {
                System.out.print(",");
            }
        }
        System.out.println("");
        players ob=new players();
        ob.three(a);
    }
}