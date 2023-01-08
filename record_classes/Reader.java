package record_classes;

import java.io.*;
import java.util.*;
public class Reader
{
    private String drives[],Path;
    private File path;
    public Reader(String path)
    {
        drives = getDrives();
        this.Path = path;
        this.path = new File(resolvePath(Path));
    }

    public Reader(String app,String drive)
    {
        drives = getDrives();
    }

    public Reader()
    {
        drives = getDrives();
    }

    public String resolveInFolder(String appname,String appFolderName)
    {
        String n="";
        for(int x=0;x<drives.length;x++)
        {
            n = resolveToApp(drives[x],appname,appFolderName);
            if((new File(n).exists()))
            {
                return n;
            }
        }
        return null;
    }

    public String resolveInApp(String appname,boolean Unknown)
    {
        String n="";
        for(int x=0;x<drives.length;x++)
        {
            n = resolveToApp(drives[x],appname,Unknown);
            if((new File(n).exists()))
            {
                return n;
            }
        }
        return null;
    }

    public String resolveToApp(String drivePath,String appname,String appFolderName)//,boolean toCheckAll)
    {
        if(appname.matches(".*[.]*."))
        {
            String appFolder = resolve(drivePath,appFolderName);
            String appPath = resolve(appFolder,appname);
            return  appPath;
        }
        else
        {
            return "Not An app";
        }
    }

    public String resolveToApp(String drivePath,String appname,boolean Unknown)//,boolean toCheckAll)
    {
        int indexPeriodSeparator  = appname.indexOf(".");
        if(indexPeriodSeparator > -1)
        {
            if(!Unknown)
            {
                String appFolderName = appname.substring(0,indexPeriodSeparator);
                String appFolder = resolve(drivePath,appFolderName);
                String appPath = resolve(appFolder,appname);
                return  appPath;
            }
            else
            {
                String appPath = resolve(drivePath,appname);
                return  appPath;
            }
        }
        else
        {
            return "Not An app";
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
            arr[ar.length - 1] = val;
        }
        else
        {
            arr[0] = val;
        }
        return arr;
    }

    public String resolve(String Path,String appFolder)//,boolean toCheckAll)
    {
        String path = Path + "\\" +  appFolder;
        if(resolvePath(path) != null)
        {
            //System.out.println("Occured Path : "+path);
            //System.out.println("Type 1 to exit");
            //int t = new Scanner(System.in).nextInt();
            //if(t == 1)
            //{
            return path;
            //}
        }
        else
        {
            File folder = null;
            String files[] = null;
            int x=0;
            String toBeReturned;
            try
            {
                folder = new File(Path+"\\");
                files = folder.list();
                x=0;
                if(files==null || files.length == 0)
                {
                    return "";
                }

                do
                {
                    String testPath = Path+"\\"+files[x];
                    String testFolder = appFolder;
                    System.out.println("Checking for : \ntest Path : "+testPath + "\t\t\ttest Folder : "+testFolder);
                    if(new File(toBeReturned =  resolve(Path+"\\"+files[x++],appFolder)).exists())
                    {
                        return toBeReturned;
                    }
                }while(x<files.length);
                return toBeReturned;
            }
            catch(Exception e)
            {
                System.out.println(e.getMessage());
                new Scanner(System.in).nextLine();
            }
            return null;
        }
    }

    public String resolvePath(String path)//,boolean toCheckALL)
    {
        /*if(toCheckALL)
        {
        for(int x=0;x<drives.length;x++)
        {
        String tempPath = drives[x] + path;
        File temp = new File(tempPath);
        if(temp.exists())
        {
        return tempPath;
        }
        else if(new File(path).exists())
        {
        return path;
        }
        }
        return null;
        }*/
        //else
        //{
        File f = new File(path);
        return f.exists() ? path : null;
        //}
    }

    public static String[] getDrives()
    {
        File[] drives = File.listRoots();
        String Drives[] = new String[drives.length];
        for(int x=0;x<Drives.length;x++)
        {
            Drives[x] = drives[x].getPath();
        }
        return Drives;
    }
}