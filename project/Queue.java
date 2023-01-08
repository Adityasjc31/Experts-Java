package project;

/**ISC 2017 Q11*/
import java.util.*;
class Queue
{
    int Que[],size,front,rear;
    public Queue(int mm)
    {
        size = mm;
        Que = new int[size];
        front = rear = 0;
    }

    void addele(int v)
    {
        //entering in queue
        if(rear<size)
        {
            Que[rear++] = v;
        }
        else
        {
            System.out.println("Overflow");
        }
    }

    int delele()
    {
        //deleting from queue
        if(front<size)
        {
            return Que[front++];
        }
        else
        {
            System.out.println("Underflow");
            return -9999;
        }
    }

    void display()
    {
        //displaying queue
        if(front>0)
        {
            for(int x=0;x<size;x++)
            {
                if(x < rear)
                {
                    System.out.println(Que[x]);
                }
            }
        }
    }
}