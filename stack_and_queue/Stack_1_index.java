package stack_and_queue;


import java.util.*;
class Stack_1_index
{
    int ar[],index;
    public Stack_1_index(int size)
    {
        ar=new int[size];
        index=-1;
    }

    public void push(int n)
    {
        if(index<ar.length-1)
        {
            ar[++index]=n;
        }
        else
        {
            throw new StackOverflowError("Stack overflow");
        }
    }

    public int pop()
    {
        if(index>=0)
        {
            return ar[index--];
        }
        else
        {
            System.out.println("Stack is under flow");
            return -9999;
        }
    }
    
    public int top()
    {
        if(index>=0)
        {
            return ar[index];
        }
        else
        {
            return -999;
        }
    }
    
    public boolean isEmpty()
    {
        return index==-1;
    }
    
    public boolean isFull()
    {
        return index==ar.length-1;
    }
}