import java.util.*;
import java.io.*;
import javax.swing.*;
public class Revert
{
    String classname,month;
    int classnumber;
    public Revert(String cn,int cno)
    {
        classname=cn;
        classnumber=cno;
        month=record.getMonth();
    }

    public void revert()
    {
        FileReader fr=null;
        FileWriter fw=null;
        BufferedWriter bw=null;
        PrintWriter pw =null;
        BufferedReader br=null;
        File f1=null,f2=null;
        String filename="E:\\class_records\\"+classname+"\\"+classname+"_"+month+".txt";
        try
        {
            f1 = new File(filename);
            fr = new FileReader(filename);
            f2 = new File("E:\\class_records\\"+classname+"\\temp.txt");
            f2.createNewFile();
            fw  = new FileWriter("E:\\class_records\\"+classname+"\\temp.txt");
            bw = new BufferedWriter(fw);
            pw= new PrintWriter(bw);

            br = new BufferedReader(fr);
            String s,t=classnumber+"\t\t\t\t\t\t\t\t\t\t";
            while((s=br.readLine())!=null)
            {
                int i=s.indexOf(t);
                if(i==-1)
                {
                    pw.println(s);
                }
            }
        }
        catch(Exception e)
        {
            System.out.println("Unable to revert");
        }
        finally
        {
            try
            {
                pw.close();
                bw.close();
                fw.close();

                br.close();
                fr.close();

                if(!f1.delete())
                {
                    System.out.println(f1.exists());
                    System.out.println("Unable to delete orginal file");
                }

                f2.renameTo(f1);
                Revert_counter();
            }
            catch(Exception e1)
            {
                JOptionPane.showMessageDialog(null,"Error occured by variable e1(revert()) : "+e1.getMessage());
            }
        }
    }

    public void Revert_counter()
    {
        FileWriter fw=null;
        BufferedWriter bw =null;
        try
        {   FileReader fr=null;
            BufferedReader br=null;
            try
            {
                fr = new FileReader("E:\\class_records\\"+classname+"\\counter_"+month+".txt");
                br = new BufferedReader(fr);
                String t = br.readLine();
                int c = Integer.parseInt(t);
                c--;
                fw = new FileWriter("E:\\class_records\\"+classname+"\\counter_"+month+".txt");
                bw=new BufferedWriter(fw);
                bw.write(c+"");
            }
            finally
            {
                br.close();
                fr.close();
            }
        }
        catch(Exception e1)
        {
            JOptionPane.showMessageDialog(null,"Error occured by variable e1(revert_counter()) : "+e1.getMessage());
        }
        finally
        {
            try
            {
                bw.close();
                fw.close();
            }
            catch(Exception e3)
            {
            }
        }
    }
}