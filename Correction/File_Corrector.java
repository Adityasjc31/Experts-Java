package Correction;

import java.io.*;
import java.util.*;
class File_Corrector
{
    private String path,refFile;
    private File Path,RefFile;
    private static Scanner sc;
    public File_Corrector(String path)
    {
        this.path = path;
        Path = new File(path);
        try
        {
            sc = new Scanner(Path);
        }
        catch(Exception e){}
    }

    public File_Corrector(String path,String refFile)
    {
        this(path);
        this.refFile = refFile;
        RefFile = new File(refFile);
        try
        {
            sc = new Scanner(Path);
        }
        catch(Exception e){}
    }
    
    public static Scanner requestScanner()
    {
        if(sc==null)
        {
            System.out.println("Request Denied");
            return null;
        }
        return sc;
    }
    
    public void read()
    {
        try
        {
            FileUnderstander funder = new FileUnderstander(RefFile);
            File temp = new File(path.substring(0,path.lastIndexOf("\\"))+"\\temp.txt");
            FileWriter fw = new FileWriter(temp);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);

            String l;
            while((l = sc.nextLine())!=null)
            {
                if(funder.isItACommand(l))
                {
                    System.out.println(l);
                }
                else if(funder.isValidToken(l))
                {
                    System.out.println(l);
                }
            }

            pw.close();
            bw.close();
            fw.close();
        }
        catch(Exception e)
        {
            //System.out.println(e.getMessage());
        }
    }
}