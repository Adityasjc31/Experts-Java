package tempClass12;

import java.util.*;
class Array_to_stack
{
    int m[],st[],cap,top;
    public Array_to_stack(int n)
    {
        cap=n;
        top=-1;
        m=new int[cap];
        st=new int[cap];
    }
    
    public void input_marks()
    {
        System.out.println("Enter value in ascending order only");
        for(int x=0;x<cap;x++)
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter marks "+(x+1)+" : ");
            m[x]=sc.nextInt();
            if(x!=0)
            {
                if(m[x-1]>m[x])
                {
                    System.out.println("Value is less than previous value");
                    x--;
                    continue;
                }
                else
                {
                    pushmarks(m[x]);
                }
            }
            else
            {
                pushmarks(m[x]);
            }
        }
    }
    
    public void pushmarks(int v)
    {
        if(top<=cap-2)
        {
            top++;
            st[top]=v;
        }
        else
        {
            System.out.println("Not possible");
        }
    }
    
    public int popmarks()
    {
        if(top>=0)
        {
            return st[top--];
        }
        return -999;
    }
    
    public void display()
    {
        if(top>-1)
        {
            for(int x=top;x>=0;x--)
            {
                System.out.println(popmarks());
            }
        }
        else
        {
            System.out.println("Under flow Error");
        }
    }
}