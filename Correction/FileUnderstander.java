package Correction;

import java.io.*;
import java.util.*;
public class FileUnderstander
{
    private String keywords[] = {"$",">","#"};
    private String refFile,validTokens[],commands[],followCommands[];
    private File RefFile;
    public FileUnderstander(String file)
    {
        refFile = file;
        RefFile = new File(file);
        read();
    }

    public FileUnderstander(File file)
    {
        refFile = file.getAbsolutePath();
        RefFile = file;
        read();
    }

    public boolean isCommand(String line)
    {
        String Char = line.replaceAll("\t","").charAt(0)+"";
        for(int x=0;x<keywords.length;x++)
        {
            if(Char.equals(keywords[x]))
            {
                return true;
            }
        }
        return false;
    }

    public boolean isItACommand(String line)
    {
        String cmd = line;
        for(int x=0;x<commands.length;x++)
        {
            if(cmd.equalsIgnoreCase(commands[x]))
            {
                processCommand(cmd,x+1);
                return true;
            }
        }
        return false;
    }

    public boolean isValidToken(String line)
    {
        String cmd = line;
        for(int x=0;x<validTokens.length;x++)
        {
            if(cmd.equalsIgnoreCase(validTokens[x]))
            {
                return true;
            }
        }
        return false;
    }
    private int count=1;
    public void processCommand(String token,int i)
    {
        while(i<followCommands.length)
        {
            if(followCommands[i].equals("$"))
            {
                break;
            }
            //System.out.println(followCommands[indexCmd]);
            switch(commands[i])
            {
                case "Lines" :
                i++;
                if(match(commands[i],"Scan"))
                {
                    Scanner sc = File_Corrector.requestScanner();
                    count = Integer.parseInt(commands[i].substring(commands[i].indexOf("=")+1));
                    for(int x=1;x<=count;x++)
                    {
                        String t;
                        System.out.println((t=sc.nextLine()));
                        i++;
                        if(match(commands[i],"digits"))
                        {
                            System.out.println(dividePrint(t));
                        }
                    }
                }
                /*if(match(commands[i],"digits"))
                {
                Scanner sc = File_Corrector.requestScanner();
                int digitValid = Integer.parseInt(commands[i].substring(commands[i].lastIndexOf("=")+1));
                }*/
            }
        }
    }

    public String dividePrint(String line)
    {
        String words[] = divide(line);
        String t="";
        for(int x=0;x<words.length-1;x++)
        {
            t = t + words[x] + "\n";
        }
        t = t + words[words.length-1];
        return t;
    }

    public String[] divide(String line)
    {
        line = line.trim();
        String words[] = divideBySpace(line);
        int validLength = Integer.parseInt(line.substring(line.lastIndexOf("=")+1));
        for(int x=0;x<words.length;x++)
        {
            if(words[x].length() != validLength)
            {
                words = remove(words,words[x]);
            }
        }
        return words;
    }

    public String[] remove(String ar[],String word)
    {
        String newArray[] = new String[ar.length];
        for(int x=0;x<newArray.length;x++)
        {
            if(!ar[x].equalsIgnoreCase(word))
            {
                newArray[x] = ar[x];
            }
        }
        return newArray;
    }

    public String[] divideBySpace(String line)
    {
        String words[] = null;
        StringTokenizer st = new StringTokenizer(line," ");
        while(st.hasMoreTokens())
        {
            words = push(words,st.nextToken());
        }
        return words;
    }

    public boolean match(String val,String match)
    {
        if(val.length()<match.length())
        {
            return false;
        }
        int x=0;
        for(;x<match.length();x++)
        {
            char ch = val.charAt(x);
            char hc = match.charAt(x);
            if(ch!=hc)
            {
                break;
            }
        }
        return x==match.length();
    }

    public void read()
    {
        try
        {
            Scanner sc = new Scanner(RefFile);

            String l;
            while((l = sc.nextLine())!=null)
            {
                if(isCommand(l))
                {
                    followCommands = push(followCommands,l.replaceAll("\t","").charAt(0)+"");
                    commands = push(commands,l.replaceAll("\t","").substring(1));
                }
                else
                {
                    validTokens = push(validTokens,l);
                }
            }
        }
        catch(Exception e){}
    }

    public String[] push(String ar[],String val)
    {
        if(ar==null)
        {
            ar = new String[1];
            ar[0] = val;
        }
        else
        {
            String arr[] = new String[ar.length+1];
            for(int x=0;x<ar.length;x++)
            {
                arr[x] = ar[x];
            }
            arr[ar.length] = val;
            ar = arr;
        }
        return ar;
    }
}