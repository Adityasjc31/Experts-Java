package Objects_and_classes;

import java.util.*;
class Mixer
{
    int n,arr[];
    public Mixer(int nn)
    {
        n=nn;
        arr=new int[n];
    }
    
    public void accept()
    {
        System.out.println("Enter numbers in sorted and ascending way");
        for(int x=0;x<n;x++)
        {
            System.out.println("Enter number at index "+x);
            arr[x]=new Scanner(System.in).nextInt();
        }
        Arrays.sort(arr);
    }
    
    public void display()
    {
        for(int x=0;x<n;x++)
        {
            System.out.print(arr[x]+" ");
        }
        System.out.println();
    }
    
    public Mixer mix(Mixer A)
    {
        Mixer m = new Mixer(A.n+n);
        int a=0,b=0,c=0;
        
        while(a<arr.length && b<A.arr.length)
        {
            if(arr[a]>A.arr[b])
            {
                m.arr[c++]=A.arr[b++];
            }
            else
            {
                m.arr[c++]=arr[a++];
            }
        }
        while(a<arr.length)
        {
            m.arr[c++]=arr[a++];
        }
        while(b<arr.length)
        {
            m.arr[c++]=A.arr[b++];
        }
        return m;
    }
    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of n for array 1");
        int n=sc.nextInt();
        Mixer a = new Mixer(n);
        System.out.println("Enter value of n for array 2");
        n=sc.nextInt();
        Mixer b = new Mixer(n);
        System.out.println("Enter values of array 1");
        a.accept();
        System.out.println("Enter values of array 2");
        b.accept();
        System.out.print("Array 1 : ");a.display();
        System.out.print("Array 2 : ");b.display();
        Mixer c = a.mix(b);
        System.out.print("Mixed Array : ");c.display();
    }
}