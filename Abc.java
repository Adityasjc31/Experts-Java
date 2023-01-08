public class Abc
{
    public static int sum(int... n)
    {
        int s=0;
        for(int x=0 ; x<n.length;x++)
        {
            s = s+ n[x];
        }
        
        return s;
    }
}