package stack_and_queue;

//ISC 2013
class Dequeue_0_index
{
    int arr[];
    int lim;
    int front;
    int rear;
    public Dequeue_0_index(int l)
    {
        lim = l;
        front=rear=0;
        arr = new int[lim];
    }
    
    public void addrear(int val)
    {
        if(rear<lim)
        {
            arr[rear]=val;
            rear++;
        }
        else
        {
            System.out.println("Overflow from rear");
        }
    }

    public int poprear()
    {
        if(front < rear)
        {
            return arr[--rear];
        }
        else
        {
            return -9999;
        }
    }
    
    public int popfront()
    {
        if(front < rear)
        {
            return arr[front++];
        }
        else
        {
            return -9999;
        }
    }
    
    public void addfront(int val)
    {
        if(front>0)
        {
            front--;
            arr[front]=val;
        }
        else
        {
            System.out.println("Overflow from front");
        }
    }
}