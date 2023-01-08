package isc2012;

import java.util.*;
class Combine
{
    int combine[];
    int size;
    public Combine(int nn)
    {
        size = nn;
        combine = new int[size];
    }
    
    void inputarray()
    {
        for(int x=0;x<size;x++)
        {
            System.out.println("Enter element at index "+x);
            combine[x] = new Scanner(System.in).nextInt();
        }
    }
    
    void sort()
    {
        for(int x=0;x<size-1;x++)
        {
            int i = x;
            for(int y=x+1 ;x<size;x++)
            {
                if(combine[y] < combine[i])
                {
                    i=y;
                }
            }
            
            int t = combine[x];
            combine[x] = combine[i];
            combine[i] = t;
        }
    }
   
    void mix(Combine A,Combine B)
    {
        int i=0;
        for(int x=0;x<A.size;x++)
        {
            combine[i] = A.combine[x];
            i++;
        }
        
        for(int x=0;x<B.size;x++)
        {
            combine[i] = B.combine[x];
            i++;
        }
    }
    
    void display()
    {
        for(int x=0;x<size;x++)
        {
            System.out.println(combine[x]);
        }
    }
    
    public static void main(String args[])
    {
        Combine a = new Combine(4);
        Combine b = new Combine(6);
        
        a.inputarray();
        b.inputarray();
        
        a.sort();
        b.sort();
        
        Combine c = new Combine(10);
        c.mix(a,b);
        
        c.sort();
        a.display();
        b.display();
        c.display();
    }
}