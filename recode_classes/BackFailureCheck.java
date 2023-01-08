import java.io.*;
class BackFailureCheck extends info_class
{
    private String cname;
    private File file,fileS;
    private FileReader fr;
    private BufferedReader br;
    private int hrs,mins,secs;
    public BackFailureCheck()
    {
        cname = info_class.getClassname();
        file = new File("E:\\class_records\\"+cname+"\\"+cname+" time.txt");
        fileS = new File("E:\\class_records\\"+cname+"\\"+cname+" start time.txt");
        setClassname(cname);
    }

    public boolean test()
    {
        return file.exists() ? read() : false;
    }
    
    public String time()
    {
        return format();
    }
    
    public int hours()
    {
        return hrs;
    }
    
    public int minutes()
    {
        return mins;
    }
    
    public int seconds()
    {
        return secs;
    }
    
    public void delete()
    {
        System.out.println(file.delete());
    }
    
    public void setStartTime(String t)
    {
        starttime = t;
    }
    
    public void setClassname(String t)
    {
        super.cname = t;
    }
    
    public void readStartTime()
    {
        try
        {
            fr = new FileReader(fileS);
            br = new BufferedReader(fr);
            setStartTime(br.readLine());
        }
        catch(Exception e)
        {
        }
        finally
        {
            try
            {
                br.close();
                fr.close();
            }
            catch(Exception e)
            {
            }
        }
    }
    
    public boolean read()
    {
        readStartTime();
        try
        {
            fr = new FileReader(file);
            br = new BufferedReader(fr);
            String t = br.readLine();
            int i1 = t.indexOf(':');
            int i2 = t.lastIndexOf(':');
            hrs = Integer.parseInt(t.substring(0,i1-1));
            mins = Integer.parseInt(t.substring(i1+2,i2-1));
            secs = Integer.parseInt(t.substring(i2+2));
            return true;
        }
        catch(Exception e)
        {
        }
        finally
        {
            try
            {
                br.close();
                fr.close();
            }
            catch(Exception e)
            {
            }
        }
        return false;
    }
    
    private String format()
    {
        String h="";
        if((hrs+"").length()==1)
        {
            h="0"+hrs;
        }
        else
        {
            h=""+hrs;
        }

        String m="";
        if((mins+"").length()==1)
        {
            m="0"+mins;
        }
        else
        {
            m=""+mins;
        }

        String s="";
        if((secs+"").length()==1)
        {
            s="0"+secs;
        }
        else
        {
            s=secs+"";
        }
        return h+" : "+m+" : "+s;
    }
}