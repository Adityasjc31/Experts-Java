package tempClass12;

class Queue
{
    int Que[],size,front,rear;
    //constructor
    public Queue(int mm)
    {
        if(mm<=100)
        {
            Que=new int[mm];
            size=mm;
            front=rear=0;
        }
        else
        {
            System.out.println("Overflow in capacity");
        }
    }
    //addition in Queue
    public void addQue(int val)
    {
        if(rear == size)
        {
            System.out.println("Overflow");
        }
        else
        {
            Que[rear]=val;
            rear++;
        }
    }
    
    //deletion in Queue
    public int delete()
    {
        if(front==rear)
        {
            System.out.println("Under flow");
            front=rear=0;
            return -9999;
        }
        else
        {
            int n=Que[front];
            System.out.println("Deleted Value = "+n);
            Que[front]=0;
            front++;
            return n;
        }
    }
    
    
    //printing queue elements
    public void display()
    {
        if(front!=rear)
        {
            for(int x=front;x<=rear;x++)
            {
                System.out.println(Que[x]);
            }
        }
        else
        {
            System.out.println("Queue underflow");
        }
    }
}