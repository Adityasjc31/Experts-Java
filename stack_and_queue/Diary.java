package stack_and_queue;

class Diary
{
    String Q[];
    int size,start,end;
    public Diary(int max)
    {
        start=end=0;
        size=max;
        Q=new String[size];
    }
    
    public void pushadd(String n)
    {
        if(end<size)
        {
            Q[end++]=n;
        }
        else
        {
            System.out.println("NO SPACE");
        }
    }
    
    public String popadd()
    {
        if(start<end)
        {
            return Q[start++];
        }
        else
        {
            return "????";
        }
    }
    
    public void display()
    {
        for(int x=0;x<size;x++)
        {
            System.out.println(Q[x]);
        }
    }
}