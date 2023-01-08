package prelims;

class Diary
{
    String Q[];
    int size;
    int start,end;
    Diary(int max)
    {
        size = max;
        Q = new String[size];
        start = end = 0;
    }
    
    void pushadd(String n)
    {
        if(end < size )
        {
            Q[end++] = n;
        }
        else
        {
            System.out.println("NO SPACE");
        }
    }
    
    String popadd()
    {
        if(start >= 0)
        {
            return Q[start++];
        }
        else
        {
            return "?????";
        }
    }
    
    void show()
    {
        for(int x=0;x<size;x++)
        {
            if(x>=start)
            {
                System.out.println(Q[x]);
            }
        }
    }
}