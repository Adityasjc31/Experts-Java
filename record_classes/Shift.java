package record_classes;

import java.io.*;
public class Shift extends Thread
{
    class Filter implements FilenameFilter
    {
        public boolean accept(File fn,String name)
        {
            return name.endsWith(".txt");
        }
    }
    private double classHrsMore,classCanBeDone;
    private record record;
    private File dir;
    private Timer comm;
    private String moveFiles[],cn;
    public Shift(double classCD,double more,record r,File dir,Timer communication,String classname)
    {
        super("Shifter");
        classHrsMore = Math.abs(classCD);
        classCanBeDone = Math.abs(more) + classCD;
        record = r;
        this.dir = dir;
        comm = communication ;
        moveFiles = dir.list(new Filter());
        cn = classname;
    }
    
    public void run()
    {
        while(true)
        {
            if(comm.isOpened() && comm.getTimeInSeconds() >= (classCanBeDone*60*60))
            {
                String endtime = record.getDate();
                String liveTimer = comm.getTime();
                System.out.println("Ended on : "+endtime+"\nLive Timer : "+liveTimer+"\nThe month class is over now");
                record.setEndTime(endtime);
                record.setLiveTimer(liveTimer);
                record.setHours(classHrsMore);
                record.write(true);

                analyseFileandMove();

                r = new record(cn,record.getDate(),classCanBeDone);
                
                String starttime = record.getDate();
                r.setStartTime(starttime);
                System.out.print("New Time ");
                r.write(false);
                break;
            }
        }
    }
    private record r;
    public void setrecord(record r)
    {
        record = r;
    }

    public record getrecord()
    {
        return r;
    }
    private MonthDecider m;
    public void analyseFileandMove()
    {
        m = new MonthDecider(dir);
        for(int x=0;x<moveFiles.length;x++)
        {
            moveFiles(moveFiles[x]);
        }
    }

    public void moveFiles(String name)
    {
        File nf = new File(dir.getAbsolutePath()+"\\"+m.getMonth());
        nf.mkdir();
        FileReader fr = null;
        BufferedReader br = null;
        FileWriter fw = null;
        BufferedWriter bw = null;
        PrintWriter pw = null;
        try
        {
            fr = new FileReader(dir+"\\"+name);
            br = new BufferedReader(fr);

            fw = new FileWriter(nf+"\\"+name);
            bw = new BufferedWriter(fw);
            pw = new PrintWriter(bw);
            String t=null;
            while((t = br.readLine())!=null)
            {
                pw.println(t);
            }
        }
        catch(Exception e1){}
        finally
        {
            try
            {
                br.close();
                fr.close();
                pw.close();
                bw.close();
                fw.close();
                File f = new File(dir+"\\"+name);
                f.delete();
                f.createNewFile();
            }
            catch(Exception e)
            {
            }
        }
    }
}