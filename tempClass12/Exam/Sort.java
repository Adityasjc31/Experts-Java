package tempClass12.Exam;

import java.util.*;
class Sort
{
    String str;
    int len;
    public Sort()
    {
        str=null;
        len=0;
    }
    
    public void readWord()
    {
        System.out.println("Enter a word");
        str=new Scanner(System.in).next();
        len=str.length();
    }
    
    public void arrange()
    {
        char ch[] = new char[len];
        for(int x=0;x<len;x++)
        {
            ch[x] = str.charAt(x);
        }
        
        for(int x=0;x<ch.length-1;x++)
        {
            int i=x;
            for(int y=x+1;y<ch.length;y++)
            {
                if(ch[y]<ch[i])
                {
                    i=y;
                }
            }
            char t=ch[i];
            ch[i]=ch[x];
            ch[x]=t;
        }
        
        String s = "";
        for(int x=0;x<len;x++)
        {
            s += ""+ch[x];
        }
        
        System.out.println("Arranged alphabet : "+s);
    }
    
    public void display()
    {
        System.out.println("Entered word : "+str);
        arrange();
    }
}