import java.io.*;
import java.util.*;
class ClassOver
{
    private boolean over=false;
    private File dir;
    private String files[];
    private double classHrs,totalHRStoBeCompleted,givenClassHrs;
    private static final char breakChar = 223;

    class Filter implements FilenameFilter
    {
        public boolean accept(File fn,String name)
        {
            return name.endsWith(".txt") && name.startsWith(dir.getName());
        }
    }

    public ClassOver(String dir)
    {
        this.dir = new File("E:\\class_records\\"+dir+"\\");
        files = this.dir.list(new Filter());
    }

    public ClassOver(File dir)
    {
        this.dir = dir;
        files = dir.list();
    }
    
    public ClassOver(String dir,double given)
    {
        this.dir = new File("E:\\class_records\\"+dir+"\\");
        files = this.dir.list(new Filter());
        givenClassHrs = given;
    }

    public ClassOver(File dir,double given)
    {
        this.dir = dir;
        files = dir.list();
        givenClassHrs = given;
    }
    
    public void readtotalHRStoBeCompleted()
    {
        FileReader fr = null;
        BufferedReader br = null;
        String name = dir.getAbsolutePath();
        File f = new File(name+"\\totalHRStoBeCompleted.txt");
        try
        {
            fr = new FileReader(f);
            br = new BufferedReader(fr);
            totalHRStoBeCompleted = Double.parseDouble(br.readLine());
        }
        catch(FileNotFoundException e)
        {
            try
            {
                f.createNewFile();
                totalHRStoBeCompleted = 12;
                FileWriter fw  = new FileWriter(f);
                BufferedWriter bw = new BufferedWriter(fw);
                PrintWriter pw = new PrintWriter(bw);
                pw.print("12");
                pw.close();
                bw.close();
                fw.close();
            }
            catch(Exception e1)
            {
            }
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
            catch(Exception e1){}
        }
    }

    public void analyse()
    {
        if(files == null)
        {
            classHrs = -2;
            return ;
        }
        classHrs = 0.0;
        readtotalHRStoBeCompleted();
        for(int x=0;x<files.length;x++)
        {
            File f = new File(dir+"\\"+files[x]);
            read(f);
        }
    }

    public void read(File f)
    {
        FileReader fr = null;
        BufferedReader br = null;
        try
        {
            fr = new FileReader(f);
            br = new BufferedReader(fr);
            String t = "";
            boolean iGnoreFirst=true;
            while((t=br.readLine())!=null)
            {
                if(iGnoreFirst)
                {
                    iGnoreFirst=false;
                    continue;
                }
                calculateHrs(removeAllTab(t));
            }
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
            catch(Exception e1){}
        }
    }
    
    public void calculateHrs(String data)
    {
        String time = filterTime(data);
        boolean matched = time.matches(".*[hrs]*.");
        if(matched)
        {
            time = remove(time,"hrs"," ");
            classHrs += resolve(time);
        }
    }

    public double resolve(String s)
    {
        double timeInHrs = 0.0;
        try
        {
            timeInHrs = Double.parseDouble(s);
        }
        catch(NumberFormatException e)
        {
            s = remove(s," ","");
            s = remove(s,"\t","");
            //System.out.println(s);
            StringTokenizer st = new StringTokenizer(s,"+-/*",true);
            while(st.hasMoreTokens())
            {
                String t = st.nextToken();
                switch(t)
                {
                    case "+":
                    timeInHrs += Double.parseDouble(st.nextToken());
                    break;

                    case "-":
                    timeInHrs -= Double.parseDouble(st.nextToken());
                    break;

                    default :
                    timeInHrs = Double.parseDouble(t);
                    break;
                }
            }
        }
        catch(Exception e1)
        {
            System.out.println("Error");
        }
        return timeInHrs;
    }

    public String remove(String original,String toDelete,String toBeadded)
    {
        String newValue = "";
        String mutatedClone = original+" ";
        int i = 0;
        for(int x=0;x<mutatedClone.length();x++)
        {
            char ch = mutatedClone.charAt(x);
            if(ch==' ')
            {
                String temp  = mutatedClone.substring(i,x);
                temp = temp.trim();
                if(!temp.equalsIgnoreCase(toDelete))
                {
                    newValue += temp + toBeadded;
                }
                i=x;
            }
        }
        return newValue.trim();
    }

    public String filterTime(String data)
    {
        String timeData = "";
        try
        {
            int count = 0;
            int index = -1;
            for(int x=0;x<data.length();  x++)
            {
                char ch = data.charAt(x);
                if(breakChar == ch)
                {
                    count++;
                }
                if(count == 3)
                {
                    index = x+1;
                    break;
                }
            }

            int secondIndex = data.indexOf(breakChar,index);
            timeData = data.substring(index,secondIndex);
        }
        catch(Exception e)
        {
            timeData = "0.0";
        }
        finally
        {
            if(timeData.indexOf(':') > -1)
                timeData = "0.0";
        }
        return timeData;
    }

    public String removeAllTab(String s)
    {
        String t = "";
        s = s.trim();
        boolean foundWord = false;
        for(int x=0;x<s.length();x++)
        {
            char ch = s.charAt(x);
            if(ch!='\t')
            {
                if(foundWord)
                {
                    t=t+breakChar;
                    foundWord=false;
                }
                t = t + ch;
            }
            else
            {
                foundWord=true;
            }

        }
        t = t.trim() + breakChar;
        return t;
    }

    public boolean isOver()
    {
        analyse();
        return (classHrs+givenClassHrs) >= totalHRStoBeCompleted ;
    }
    
    public double getHours()
    {
        analyse();
        return classHrs==-2 ? 0 : classHrs;
    }
    
    public boolean isMore()
    {
        analyse();
        return  (classHrs+givenClassHrs) > totalHRStoBeCompleted ;
    }
    
    public double chancesOFAnyClass()
    {
        analyse();
        return totalHRStoBeCompleted - (classHrs+givenClassHrs) ;
    }
}