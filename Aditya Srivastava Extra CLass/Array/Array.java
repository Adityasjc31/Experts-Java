package Array;

import java.io.*;
class Array
{
    public static void SetElement(int arr[])
    {
        System.out.println("Even Numbers Are :");
        for(int a=0;a<arr.length;a++)
        {
            if(arr[a]%2==0)
            {
                System.out.print(arr[a]+",");
            }
        }
        System.out.println("");
    }

    public static void main(String args [])throws IOException
    {
        int nums[]=new int[10];
        InputStreamReader in=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(in);
        for(int i=0;i<nums.length;i++)
        {
            System.out.println("Enter a number");
            String m=br.readLine();
            int num=Integer.parseInt(m);
            nums[i]=num;
        }
        System.out.print("\f");
        System.out.println("Given Data :");
        for(int i=0;i<nums.length;i++)
        {
            System.out.print(nums[i]+",");
        }
        System.out.println("");
        Array ob=new Array();
        ob.SetElement(nums);
    }
}