package stack_and_queue;

class Queue
{
    int ar[],r,f;
    public Queue(int size)
    {
        ar=new int[size];
        r=f=0;
    }
    
    public void input(int val)
    {
        if(r<ar.length)
        {
            ar[r++]=val;
        }
        else
        {
            System.out.println("Queue is full");
        }
    }
    
    public int output()
    {
        if(f<r)
        {
            return ar[f++];
        }
        else
        {
            return -999;
        }
    }
    
    public int front()
    {
        if(f<r)
        {
            return ar[f];
        }
        else
        {
            return -999;
        }
    }
}