package record_classes;

import java.io.*;
import java.util.*;
import java.nio.file.*;
import java.nio.file.attribute.*;
import java.nio.*;
public class ScanExclusion
{
    private File read;
    private String path,attr[],files[];
    public ScanExclusion(File read)
    {
        this.read = read;
        path = read.getAbsolutePath();
    }

    public ScanExclusion(String read)
    {
        path = read;
        this.read = new File(path);
    }

    public String[] scanCorrection(String dir,String file[])
    {
        for(int i=0;i<attr.length;i++)
        {
            if(attr[i].equalsIgnoreCase("<Hidden>"))
            {
                for(int x=0;x<file.length;x++)
                {
                    if(isHidden(dir+"\\"+file[x]))
                    {
                        /*System.out.println("Going to delete attr : "+attr[i]);
                        System.out.println("Going to delete value : "+file[x]);*/

                        file = remove(file,file[x]);

                        /*System.out.println("DELETED");
                        System.out.println("Press 1 to display array");
                        String s = new Scanner(System.in).nextLine();
                        if(s.equalsIgnoreCase("1"))
                        {
                            display(file);
                            new Scanner(System.in).nextLine();
                        }*/
                        x--;
                    }
                }
            }
        }

        for(int i=0;i<files.length;i++)
        {
            for(int x=0;x<file.length;x++)
            {
                if(file[x].equalsIgnoreCase(files[i]))
                {
                    /*System.out.println("Going to delete attr : "+files[i]);
                    System.out.println("Going to delete value : "+file[x]);*/

                    file = remove(file,file[x]);

                    /*System.out.println("DELETED");
                    System.out.println("Press 1 to display array");
                    String s = new Scanner(System.in).nextLine();
                    if(s.equalsIgnoreCase("1"))
                    {
                        display(file);
                        new Scanner(System.in).nextLine();
                    }*/
                    x--;
                }
                if(isfileSimilarExclusionMentioned(files[i]))
                {
                    String t = files[i].substring(0,files[i].length() - 2);
                    if(file[x].indexOf(t) > -1)
                    {
                        /*System.out.println("Going to delete Folder/File : "+files[i]);
                        System.out.println("Going to delete value : "+file[x]);*/

                        file = remove(file,file[x]);
                        
                        /*System.out.println("DELETED");
                        System.out.println("Press 1 to display array");
                        String s = new Scanner(System.in).nextLine();
                        if(s.equalsIgnoreCase("1"))
                        {
                            display(file);
                            new Scanner(System.in).nextLine();
                        }*/
                        x--;
                    }
                }
            }
        }
        return file;
    }

    public void display(String ar[])
    {
        int c = 0;
        for(int x=0;x<ar.length;x++)
        {
            System.out.print(ar[x]+"\t");
            if(c!=0 && c%4==0)
            {
                System.out.println();
            }
            c++;
        }
    }

    public String[] remove(String ar[],String remove)
    {
        String Ar[] = null;
        for(int x=0;x<ar.length;x++)
        {
            if(!ar[x].equalsIgnoreCase(remove))
            {
                Ar = push(Ar,ar[x]);
            }
        }
        return Ar;
    }

    public boolean isHidden(String file)
    {
        try
        {
            Path p = Paths.get(file);
            DosFileAttributes dos = Files.readAttributes(p, DosFileAttributes.class);
            if(dos.isHidden())
            {
                return true;
            }
        }
        catch(Exception e)
        {}
        return false;
    }

    public boolean isfileSimilarExclusionMentioned(String t)
    {
        if(t.charAt(t.length()-1)=='>' && t.charAt(t.length()-2)=='<')
        {
            return true;
        }
        return false;
    }

    public void read()
    {
        FileReader fr = null;
        BufferedReader br = null;
        try
        {
            fr = new FileReader(read);
            br = new BufferedReader(fr);
            String line;
            while((line = br.readLine())!=null)
            {
                assign(line);
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
            catch(Exception e1)
            {
            }
        }
    }

    public void assign(String word)
    {
        if(isCaseAttr(word))
        {
            attr = push(attr,word);
        }
        else
        {
            files = push(files,word);
        }
    }

    private String[] push(String ar[],String val)
    {
        if(ar==null)
        {
            ar = new String[0];
        }
        String arr[] = new String[ar.length+1];
        for(int x=0;x<ar.length;x++)
        {
            arr[x] = ar[x];
        }
        if(ar.length != 0)
        {
            arr[ar.length] = val;
        }
        else
        {
            arr[0] = val;
        }
        return arr;
    }

    public boolean isCaseAttr(String t)
    {
        if(t.charAt(0) == '<' && t.charAt(t.length()-1) == '>')
        {
            return true;
        }
        return false;
    }
}