package stack_and_queue;

import java.util.*;
class ArrayCopy
{
    int ar[] = null;
    public void copy(int ar[])
    {
        this.ar=ar;
    }
    
    public void print(int ar[])
    {
        for(int x=0;x<ar.length;x++)
        {
            System.out.print(ar[x] + " ");
        }
        System.out.println();
    }
    
    public void print()
    {
        print(ar);
    }
    
    public static void main(String args [])
    {
        ArrayCopy obj = new ArrayCopy();
        int ar[] = {1,2,3,4,5,6};
        obj.print(ar);
        obj.copy(ar);
        ar[0]=18;
        obj.print();
    }
}