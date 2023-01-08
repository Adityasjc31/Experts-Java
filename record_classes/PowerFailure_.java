package record_classes;

import java.io.*;
class PowerFailure_ extends Thread
{
    private String cname,time;
    private File f,fs;
    private FileWriter fw = null;
    private BufferedWriter bw = null;
    private PrintWriter pw = null;
    private boolean b,wb;
    public PowerFailure_(String cn,String time)
    {
        cname=cn;
        f = new File("E:\\class_records\\"+cname+"\\"+cname+" time.txt");
        fs = new File("E:\\class_records\\"+cname+"\\"+cname+" start time.txt");
        f.delete();
        fs.delete();
        this.time = time;
        f.delete();
        wb=true;
        
        Runtime r = Runtime.getRuntime();
        r.addShutdownHook(this);
    }

    public void Stop()
    {
        interrupt();
    }

    public void run()
    {
        writeStartingTime();
        while(b)
            try
            {
                if(wb)
                {
                    fw= new FileWriter(f);
                    bw = new BufferedWriter(fw);
                    pw = new PrintWriter(bw);
                    pw.println(time);
                }
            }
            catch(Exception e)
            {
                pw.flush();
            }
            finally
            {
                try
                {
                    pw.close();
                    bw.close();
                    fw.close();
                }
                catch(Exception e1)
                {
                }
            }
    }

    public void writeStartingTime()
    {
        try
        {
            fw = new FileWriter(fs);
            bw = new BufferedWriter(fw);
            pw = new PrintWriter(bw);

            pw.println(info_class.getStartTime());
        }
        catch(Exception e)
        {
        }
        finally
        {
            try
            {
                pw.close();
                bw.close();
                fw.close();
            }
            catch(Exception e)
            {
            }
        }
    }

    public boolean deleteFile()
    {
        boolean b1 = f.delete();
        if(!b1)
        {
            try
            {
                stop();
                b=false;
                pw.close();
                bw.close();
                fw.close();
                f.delete();
                f.deleteOnExit();
            }
            catch(Exception e)
            {
            }
        }
        boolean b2 = fs.delete();
        return b2 && b1;
    }

    public boolean deleteConfirm()
    {
        boolean b1 = f.delete();
        if(b1==false && f.exists())
        {
            try
            {
                stop();
                interrupt();
                destroy();
            }
            catch(Exception e)
            {}
            finally
            {
                return deleteConfirm();
            }
        }
        return true;
    }

    public void setExcecution(boolean b)
    {
        this.b=b;
    }

    public void update(String t)
    {
        time=t;
    }

    public void setWriteable(boolean b)
    {
        wb=b;
    }
}