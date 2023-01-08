public class MOBIUS
{
    public static int MOBIUS(int n)
    {
        if(n==1)
        {
            return 1;
        }
        
        
        int c=0,ch=0;
        boolean b=true;
        for(int d=2;d<=n;)
        {
            if(n%d == 0)
            {
                if(ch == d)
                {
                    b=false;
                    break;
                }
                ch=d;
                c++;
                n=n/d;
            }
            else
            {
                d++;
            }
        }
        if(!b)
        {
            return 0;
        }
        else if(c%2 == 0)
        {
            return 1;
        }
        else
        {
            return -1;
        }
    }
}