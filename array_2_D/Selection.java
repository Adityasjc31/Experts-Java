package array_2_D;

import java.util.*;
class Selection
{
    public static int[] Sort(int s[])
    {
        for(int x=0;x<s.length-1;x++)    
        {
            int i=x;
            for(int y=x+1;y<s.length;y++)
            {
                if(s[y]<s[i])
                {
                    i=y;
                }
            }
            int t=s[x];
            s[x]=s[i];
            s[i]=t;
        }
        return s;
    }
}