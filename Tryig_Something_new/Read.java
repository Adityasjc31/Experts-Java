package Tryig_Something_new;

import java.io.*;
public class Read
{
    private String File;
    private LinkList lines;
    private File file;
    public Read(String file)
    {
        this.File = file;
        this.file = new File(File);
    }

    public void read()
    {
        lines = new LinkList();
        FileReader fr = null;
        BufferedReader br = null;
        try
        {
            fr = new FileReader(file);
            br = new BufferedReader(fr);
            
            String line = "";
            while((line = br.readLine())!=null)
            {
                lines.insert(line,false);
            }
            lines.display();
        }
        catch(Exception e)
        {
            try
            {
                fr.close();
                br.close();
            }
            catch(IOException e0)
            {}
            catch(NullPointerException e1)
            {}  
        }
    }
}