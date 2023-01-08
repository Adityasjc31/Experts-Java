package stack_and_queue;

import java.util.*;
class Stack_0_index
{
    int ar[],index;
    public Stack_0_index(int size)
    {
        ar=new int[size];
        index=0;
    }

    public void push(int n)
    {
        if(index<ar.length)
        {
            ar[index]=n;
            index++;
        }
        else
        {
            throw new StackOverflowError("Stack overflow");
        }
    }

    public int pop()
    {
        if(index>0)
        {
            return ar[--index];
        }
        else
        {
            System.out.println("Stack is under flow");
            return -999;
        }
    }
    
    public int top()
    {
        if(index>0)
        {
            return ar[index-1];
        }
        else
        {
            return -999;
        }
    }
    
    public boolean isEmpty()
    {
        return index==0;
    }
    
    public boolean isFull()
    {
        return index==ar.length;
    }
}