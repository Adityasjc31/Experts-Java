package prelims;

public class DuckCheck
{
    static int isDuck(int count )
    {
        int d = count%10;
        if(d==0)
        {
            return 1;
        }
        else if(count/10 == 0)
        {
            return 0;
        }
        else
        {
            return isDuck(count/10);
        }
    }
} 
