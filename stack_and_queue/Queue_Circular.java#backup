package stack_and_queue;

public class Queue_Circular
{
    int ar[];
    int f,r;
    public Queue_Circular(int size)
    {
        ar=new int[size];
        f=-1;
        r=-1;
    }
    
    public void input(int n)
    {
        if(!(f==r&&f!=-1 || f==-1 && r==ar.length-1))
        {
            r++;
            if(r==ar.length)
            {
                r=0;
            }
            ar[r]=n;
        }
        else
        {
            System.out.println("Queue is full");
        }
    }
    
    public int output()
    {
        if(f==-1 && r==-1)
        {
            return -9999;
        }
        else
        {
            f++;
            if(f==ar.length)
            {
                f=0;
            }
            int ret=ar[f];
            if(f==r)
            {
                f=-1;
                r=-1;
            }
            return ret;
        }
    }
}