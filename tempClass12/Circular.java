package tempClass12;

//public class Circular_queue_operation
class Circular
{
    int que[],front,rear,size;
    //constructor
    public Circular(int capacity)
    {
        size=capacity;
        que=new int[size];
        front=rear=0;
    }
    
    //function to add in circular queue
    public void insert_que(int val)
    {
        if(front==0 && rear==size)
        {
            System.out.println("Overflow");
        }
        else if(front==rear && que[rear]!=0)
        {
            System.out.println("Overflow");
        }
        else
        {
            if(rear==size && front>0)
            {
                rear=0;
            }
            que[rear]=val;
            rear++;
        }
    }
    
    public int deleteque()
    {
        if(front==0 && rear==0)
        {
            System.out.println("Que Underflow");
            return  -999;
        }
        else if(front==rear && que[rear]==0)
        {
            System.out.println("Que Underflow");
            return  -999;
        }
        else
        {
            int val=que[front];
            System.out.println("Deleted value = "+val);
            que[front]=0;
            front++;
            if(front==size && rear==size)
            {
                front=rear=0;
            }
            else if(front==rear && rear!=size)
            {
                front=0;
            }
            return val;
        }
    }
    
    public void display()
    {
        for(int x=0;x<size;x++)
        {
            if(que[x]!=0)
            {
               System.out.println(que[x]); 
            }
        }
    }
}