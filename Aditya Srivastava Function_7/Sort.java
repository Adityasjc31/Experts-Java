class Sort
{
    public static void sort(int n[])
    {
        for(int x=0;x<n.length-1;x++)
        {
            for(int y=0;y<n.length-1-x;y++)
            {
                if(n[y]>n[y+1])
                {
                    int t=n[y];
                    n[y]=n[y+1];
                    n[y]=t;
                }
            }
        }
    }
}