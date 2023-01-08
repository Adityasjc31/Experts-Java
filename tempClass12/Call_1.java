package tempClass12;

import java.util.*;
class queue
{
    int ar[]=new int[10],rear,front,size;
    //constructor
    public queue()
    {
        for(int x=0;x<size;x++)
        {
            ar[x]=0;
        }
        front=rear=-1;
        size=10;
    }

    public void add_queue(int val)
    {
        if(rear<=size-2)
        {
            rear++;
            ar[rear]=val;
            System.out.println("Added value in queue = "+ar[rear]);
        }
        else
        {
            System.out.println("Queue is full");
        }
    }
    
    public void del_queue()
    {
        if(front!=rear)
        {
            front++;
            System.out.println("Deleted value = "+ar[front]);
        }
        else
        {
            System.out.println("Queue empty");
            front=rear=-1;
        }
    }
    
    public void display()
    {
        if(front !=rear)
        {
            for(int x=front+1;x<=rear;x++)
            {
                System.out.println(ar[x]);
            }
        }
        else
        {
            System.out.println("Queue is empty . Can't display");
        }
    }
}

public class Call_1
{
    public static void main(String args[])
    {
        queue obj = new queue();
        int ch;
        do
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("1 - add in queue\n2 - Delete from queue\n3 - Display queue\n4 - Exit");
            System.out.println("Enter your choice");
            ch = sc.nextInt();
            switch(ch)
            {
                case 1:
                System.out.println("Menu :\nEnter a value to  add in queue");
                int v=sc.nextInt();
                obj.add_queue(v);
                break;
                
                case 2:
                System.out.println("Delete a value in queue");
                obj.del_queue();
                break;
                
                case 3:
                obj.display();
                break;
                
                case 4:
                System.out.println("Exited from queue");
                break;
                
                default:
                System.out.println("Wrong Choice");
            }
        }while(ch!=4);
    }
}