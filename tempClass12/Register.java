package tempClass12;


class Register
{
    String student[];
    int top,count,capacity;
    //constructor
    public Register(int max)
    {
        student = new String[max];
        top=-1;
        count=0;
        capacity=max;
    }
    //addition in stack
    public void push(String name)
    {
        if(top<capacity-1)
        {
            if(name.charAt(0)=='A')
            {
                top++;
                student[top]=name;
            }
            else
            {
                System.out.println("Name can't be added in stack");
            }
        }
        else
        {
            System.out.println("Overflow in stack");
        }
    }
    
    public String pop()
    {
        int l;
        char ch1,ch2;
        String n="";
        if(top!=-1)
        {
            n=student[top];
            l=n.length();
            ch1=n.charAt(0);
            ch2=n.charAt(l-1);
            if(ch1=='A' & ch2=='A')
            {
                System.out.println(n);
                count++;
            }
            top--;
            return n;
        }
        else
        {
            return "$$";
        }
    }
    
    public void display()
    {
        if(top!=-1)
        {
            for(int x=top;x>=0;x--)
            {
                System.out.println(student[x]);
            }
            System.out.println("Number of names starting and ending with 'A' : "+count);
        }
        else
        {
            System.out.println("Stack is empty");
        }
    }
}