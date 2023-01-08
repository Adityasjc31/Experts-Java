import java.util.*;
import java.io.*;
import java.text.*;
import javax.swing.*;
public class record
{
    private String classname,starttime,endtime,live_timer;
    private double hours;
    private int classno;
    public record(String classname,String date_time_day,int hours)
    {
        this.classname=classname;
        starttime=date_time_day;
        this.hours=hours;
    }

    public record(String classname,String date_time_day,double hours)
    {
        this.classname=classname;
        starttime=date_time_day;
        this.hours=hours;
    }

    public record(String classname,String date_time_day)
    {
        this.classname=classname;
        starttime=date_time_day;
        this.hours=1;
    }

    public record()
    {
        this.classname="Mathematics";
        starttime="55646";
        this.hours=1;
    }

    public void setClassNo(int c)
    {
        classno = c;
    }

    public void setEndTime(String et)
    {
        endtime=et;
    }

    public void setStartTime(String st)
    {
        starttime=st;
    }

    public void setLiveTimer(String str)
    {
        live_timer=str;
    }

    public static void read(String classname)
    {
        FileReader fr  = null;
        BufferedReader br = null;
        try
        {
            fr=new FileReader("E:\\class_records\\"+classname+"\\"+classname+"_"+getMonth()+".txt");
            br=new BufferedReader(fr);
            String line="";boolean l1=true;
            while((line=br.readLine())!=null)
            {
                System.out.println(line);
                if(!l1)
                    new Scanner(System.in).nextLine();
                l1=false;
            }
            if(!l1)
                System.out.println("Only this much exist");
        }
        catch(Exception e)
        {
            try
            {
                br.close();
                fr.close();
                JOptionPane.showMessageDialog(null,"Error occured by variable e(read(String)) : "+e.getMessage());
            }
            catch(Exception e1)
            {
                System.out.println("Nothing is there");
                JOptionPane.showMessageDialog(null,"Error occured by variable e1(read(String)) : "+e.getMessage());
            }
        }
    }
    private FileReader rfr = null;
    private BufferedReader rbr = null;
    public String readCounter()
    {
        File f = new File("E:\\class_records\\"+classname+"\\counter_"+getMonth()+".txt");

        try
        {
            f.createNewFile();
            rfr = new FileReader("E:\\class_records\\"+classname+"\\counter_"+getMonth()+".txt");
            rbr = new BufferedReader(rfr);

            return rbr.readLine();
        }
        catch(Exception e)
        {
        }
        finally
        {
            try
            {
                rbr.close();
                rfr.close();
            }
            catch(Exception e1)
            {
                JOptionPane.showMessageDialog(null,"Error occured by variable e1(readCounter) : "+e1.getMessage());
            }
        }

        return null;
    }
    private FileWriter wfw = null;
    private BufferedWriter wbw = null;
    private PrintWriter wpw = null;

    public void writeCounter(int counter)
    {
        try
        {
            wfw = new FileWriter("E:\\class_records\\"+classname+"\\counter_"+getMonth()+".txt");
            wbw = new BufferedWriter(wfw);
            wpw = new PrintWriter(wbw);
            wpw.print(counter);
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"Error occured by variable e(writeCounter) : "+e.getMessage());
        }
        finally
        {
            try
            {
                wpw.close();
                wbw.close();
                wfw.close();
            }
            catch(Exception e1)
            {
                JOptionPane.showMessageDialog(null,"Error occured by variable e1(writeCounter) : "+e1.getMessage());
            }
        }
    }

    private FileReader gfr;
    private Scanner gbr;
    public String getData()
    {
        try
        {
            gfr = new FileReader("E:\\class_records\\"+classname+"\\"+classname+"_"+getMonth()+".txt");
            gbr = new Scanner(gfr);
            String r="";
            String t=null;
            while(gbr.hasNextLine())
            {
                t=gbr.nextLine();
                if(gbr.hasNextLine())
                {
                    r = r + t + "\n";
                }
            }
            return r;
        }
        catch(Exception e)
        {
        }
        finally
        {
            try
            {
                gbr.close();
                gfr.close();
            }
            catch(Exception e1)
            {
                JOptionPane.showMessageDialog(null,"Error occured by variable e1(readCounter) : "+e1.getMessage());
            }
        }
        return null;
    }

    public boolean isDataAvaliable()
    {
        FileReader fr = null;
        BufferedReader br = null;
        try
        {
            fr = new FileReader("E:\\class_records\\"+classname+"\\"+classname+"_"+getMonth()+".txt");
            br = new BufferedReader(fr);
            String t = br.readLine();
            if(t==null)
            {
                return false;
            }
            else
            {
                return true;
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"Error occured by variable e(isDataAvaliable)) : "+e.getMessage());
        }
        finally
        {
            try
            {
                br.close();
                fr.close();
            }
            catch(Exception e1)
            {
                JOptionPane.showMessageDialog(null,"Error occured by variable e1(isDataAvaliable) : "+e1.getMessage());
            }
        }
        return false;
    }

    String initWritetime = null;
    public void write(boolean isEnded)
    {
        FileWriter fw = null;
        BufferedWriter bw = null;
        PrintWriter pw = null;
        try
        {
            fw = new FileWriter("E:\\class_records\\"+classname+"\\"+classname+"_"+getMonth()+".txt",true);
            bw = new BufferedWriter(fw);
            pw= new PrintWriter(bw);

            int counter=0,c_subsitute=0;

            if(classno == 0)
            {
                if(readCounter()!=null)
                {
                    counter = Integer.parseInt(readCounter());
                    if(!isEnded)
                        writeCounter(++counter);
                }
                else
                {
                    writeCounter(++counter);
                }
            }
            else
            {
                c_subsitute=counter;
                counter = classno;
            }

            if(isDataAvaliable())
            {
                if(isEnded)
                {
                    if(classno!=0)
                    {
                        String p = getData();
                        if(p!=null)
                        {
                            pw.close();
                            bw.close();
                            fw.close();

                            fw = new FileWriter("E:\\class_records\\"+classname+"\\"+classname+"_"+getMonth()+".txt");
                            bw = new BufferedWriter(fw);
                            pw= new PrintWriter(bw);

                            
                            pw.println(p);
                            writeCounter(c_subsitute);
                            if(initWritetime == null)
                            {
                                initWritetime = info_class.getStartTime();
                                setStartTime(initWritetime);
                            }
                            String temp=counter+"\t\t\t\t\t\t\t\t\t\t"+starttime+"\t\t\t\t\t"+endtime+"\t\t"+hours+" hrs\t\t\t\t"+timedifferenceCalculate()+"\t\t"+live_timer+"\t\t\t"+initWritetime+","+getDate();
                            pw.println(temp);
                        }
                    }
                    else
                    {
                        if(initWritetime == null)
                        {
                            initWritetime = info_class.getStartTime();
                        }
                        pw.println("\t\t\t\t\t"+endtime+"\t\t"+hours+" hrs\t\t\t\t"+timedifferenceCalculate()+"\t\t"+live_timer+"\t\t\t"+initWritetime+","+getDate());
                    }
                }
                else
                {
                    initWritetime=getDate();
                    pw.print(counter+"\t\t\t\t\t\t\t\t\t\t"+starttime);
                }
            }
            else
            {
                String temp2 ="ClassNumber\t\t\t\t\t\t\t\t\tStart Time\t\t\t\t\t\t\t\t\t\tEnd Time\t\t\t\t\t\t\tDuration of hours(to be held)\tDuration of hours(calculated)\t\tLive Time Recorded\t\t\t\t\tWritten at time";
                pw.println(temp2);
                initWritetime=getDate();
                pw.print(counter+"\t\t\t\t\t\t\t\t\t\t"+starttime);
            }
        }
        catch(FileNotFoundException ef)
        {
            if(create())
                write(false);
        }
        catch(Exception e3)
        {
            //System.out.println("Unable to write to file\n"+e3 );
            //new Scanner(System.in).nextLine();
        }
        finally
        {
            try
            {
                pw.close();
                bw.close();
                fw.close();
                System.out.println("Written successfully");
            }
            catch(Exception eq)
            {
                //JOptionPane.showMessageDialog(null,"Error occured by variable eq(write()) : "+eq.getMessage());
            }
        }
    }

    public boolean create()
    {
        try
        {
            String temp ="E:\\class_records\\"+classname ;
            File f = new File(temp);
            return f.mkdirs();
        }
        catch(Exception e)
        {
            System.out.println(e);
            JOptionPane.showMessageDialog(null,"Error occured by variable e(create()) : "+e.getMessage());
            return false;
        }
    }

    public static String getDate()
    {
        Date d = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("EEE MMMM, dd yyyy  hh:mm:ss a  zzzz");
        String d1 = sdf.format(d);

        return d1;
    }
    private static String month[]={"Januray","Feburary","March","April","May","June","July","August","September","October","November","December"};
    public static String getMonth()
    {
        Calendar c = Calendar.getInstance();
        return month[c.get(Calendar.MONTH)];
    }

    public String timedifferenceCalculate()
    {
        String stduration[] = timefilter(starttime);
        String etduration[] = timefilter(endtime);
        int startsecs,endsecs;
        if(!(is_am(starttime) ^ is_am(endtime)))
        {
            startsecs = timetoSeconds(stduration);
            endsecs = timetoSeconds(etduration);
        }
        else
        {
            if(!is_am(starttime))
            {
                int temp = Integer.parseInt(stduration[0]) + 12;
                stduration[0]= temp+"";
            }
            else
            {
                int temp = Integer.parseInt(etduration[0]) + 12;
                etduration[0]= temp+"";
            }
            startsecs = timetoSeconds(stduration);
            endsecs = timetoSeconds(etduration);
        }

        int differsecs = Math.abs(endsecs - startsecs);

        return secondstoHourFormat(differsecs);
    }

    public boolean is_am(String time)
    {
        int i = time.indexOf("AM");
        if(i!=-1)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public int timetoSeconds(String ar[])
    {
        int hrs=Integer.parseInt(ar[0]);
        int mins=Integer.parseInt(ar[1]);
        int secs=Integer.parseInt(ar[2]);

        int time = (hrs*60*60) + (mins*60) + secs;
        return time;
    }

    public String secondstoHourFormat(int secs)
    {
        int hrs = secs/3600;
        int mins = secs/60 - (hrs*60);
        int t=(secs/60)*60;
        int sec = secs - t;
        return hrs+":"+mins+":"+sec+"("+hrs+"hrs "+mins+"mins "+sec+"secs )";
    }

    public  String[] timefilter(String str)
    {
        int findex=str.indexOf(":");
        int lindex=str.lastIndexOf(":");
        String hrs = str.substring(findex-2,findex);
        String mins = str.substring(findex+1,lindex);
        String seconds = str.substring(lindex+1,lindex+3);
        String noonFactor = str.substring(lindex+4,lindex+6);
        if(noonFactor.equalsIgnoreCase("PM"))
        {
            int h = Integer.parseInt(hrs);
            if(h >0 && h!=12)
            {
                h=h+12;
                hrs = h+"";
            }
        }
        String ar[]= {hrs,mins,seconds};
        return ar;
    }
}