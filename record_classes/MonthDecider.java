package record_classes;

import java.io.*;
public class MonthDecider
{
    private static final String month[]={"Januray","Feburary","March","April","May","June","July","August","September","October","November","December"};
    class Filter implements FilenameFilter
    {
        public boolean accept(File fn,String name)
        {
            return name.indexOf('.') == -1;
        }
    }
    private File dir;
    private String files[];
    private String decidedMonth;
    public MonthDecider(String s)
    {
        dir = new File(s);
        files = dir.list(new Filter());
    }

    public MonthDecider(File f)
    {
        dir = f;
        files = dir.list(new Filter());
    }
    private void decideMonth()
    {
        int matched = -1;
        for(int x=0;x<month.length;x++)
        {
            for(int y=0;y<files.length;y++)
            {
                if(month[x].equalsIgnoreCase(files[y]))
                {
                    matched = x;
                }
            }
        }
        //             boolean b = false;
        //             for(int y=0;y<files.length;y++)
        //             {
        //                 if(files[y].equalsIgnoreCase(month[x]))
        //                 {
        //                     b=true;
        //                     break;
        //                 }
        //             }
        //             if(!b)
        //             {
        //                 decidedMonth = month[x];
        //                 break;
        //             }
        decidedMonth = month[matched==month.length-1 ? 0 : matched+1];
    }

    public String getMonth()
    {
        decideMonth();
        return decidedMonth;
    }
}