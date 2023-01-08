import java.io.*;
import java.util.*;
class RemoveFileReduantantData
{
    private String filename,ar[],filepath;
    private File f;
    public RemoveFileReduantantData(String fp,String fn)
    {
        filename = fn;
        filepath = fp;
        f = new File(filename);
        read();
    }

    public void correct()
    {
        File ft = new File(filepath+"temp.txt");
        FileWriter fw=null;
        BufferedWriter bw = null;
        PrintWriter pw = null;
        try
        {
            ft.createNewFile();
            fw = new FileWriter(filepath+ft.getName());
            bw = new BufferedWriter(fw);
            pw = new PrintWriter(bw);

            for(int x=0;x<ar.length;x++)
            {
                if(isToBeWritten(ar[x]))
                {
                    pw.println(ar[x]);
                    System.out.println(ar[x]);
                }
            }
        }
        catch(Exception e){}
        finally
        {
            try
            {
                pw.close();
                bw.close();
                fw.close();
                f.delete();
                ft.renameTo(f);
            }catch(Exception e1){}
        }
    }

    private boolean isToBeWritten(String s)
    {
        return occuring(s)==1;
    }

    private int occuring(String s)
    {
        int c=0;
        for(int x=0;x<ar.length;x++)
        {
            if(ar[x].equals(s))
            {
                c++;
            }
        }
        return c;
    }

    private void read()
    {
        FileReader fr = null;
        BufferedReader br = null;
        try
        {
            fr= new FileReader(filepath+filename);
            br = new BufferedReader(fr);
            String t = "";
            double c=0;
            while((t=br.readLine())!=null)
            {
                c++;
            }
            br.close();
            fr.close();

            fr = new FileReader(filepath+filename);
            br = new BufferedReader(fr);

            ar = new String[(int)c];
            for(int x=0;x<c;x++)
            {
                ar[x] = br.readLine();
            }
            br.close();
            fr.close();
        }
        catch(Exception e)
        {
            try
            {
                br.close();
                fr.close();
            }
            catch(Exception e1)
            {
            }
        }
    }
    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter path of file");
        String fp = sc.next();
        System.out.println("Enter file name");
        String fn = sc.next();
        RemoveFileReduantantData r = new RemoveFileReduantantData(fp,fn);
        r.correct();
    }
}