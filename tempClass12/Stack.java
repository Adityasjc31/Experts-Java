package tempClass12;

import java.util.*;
class Stack
{
    int ar[] = new int[10],top,size;
    //Constructor
    public Stack()
    {
        for(int x=0;x<10;x++)
        {
            ar[x]=0;
        }
        top=-1;
        size=10;
    }

    //Addition of stack
    public void addstack(int val)
    {
        if(top<=size-2)
        {
            top++;
            ar[top]=val;
            System.out.println("Added value in stack = "+ar[top]);
        }
        else
        {
            System.out.println("Stack is full");
        }
    }

    public void deleteStack()
    {
        if(top>=0)
        {
            System.out.println("Deleted value = "+ar[top]);
            ar[top]=0;
            top--;
        }
        else
        {
            System.out.println("Stack is empty");
        }
    }
    
    public void display()
    {
        if(top>=0)
        {
            for(int x=0;x<=top;x++)
            {
                System.out.println(ar[x]);
            }
        }
        else
        {
            System.out.println("Stack is empty.Can't Display any value");
        }
    }
}


/*public class Call_1
{
    public static void main(String args[])
    {
        Stack obj = new Stack();
        int ch;
        do
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("1 - add in stack\n2 - Delete from stack\n3 - Display stack\n4 - Exit");
            System.out.println("Enter your choice");
            ch = sc.nextInt();
            switch(ch)
            {
                case 1:
                System.out.println("Enter a value to  add in stack");
                int v=sc.nextInt();
                obj.addstack(v);
                break;
                
                case 2:
                System.out.println("Delete a value in stack");
                obj.deleteStack();
                break;
                
                case 3:
                obj.display();
                obj.deleteStack();
                break;
                
                case 4:
                System.out.println("Exited from stack");
                break;
                
                default:
                System.out.println("Wrong Choice");
            }
        }while(ch!=4);
    }
}*/