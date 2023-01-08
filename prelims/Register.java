package prelims;

class Register
{
    String stud[];
    int cap,top;
    Register(int max)
    {
        cap = max;
        stud = new String[cap];
        top = -1;
    }
    
    void push(String n)
    {
        if(top<cap - 1)
        {
            stud[++top] = n;
        }
        else
        {
            System.out.println("OVERFLOW");
        }
    }
    
    String pop()
    {
        if(top>=0)
        {
            return stud[top--];
        }
        else
        {
            return "$$";
        }
    }
    
    void display()
    {
        for(int x=0;x<cap;x++)
        {
            System.out.println(stud[x]);
        }
    }
}