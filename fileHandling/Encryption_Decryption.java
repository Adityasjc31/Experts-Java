package fileHandling;

import java.io.*;
class Encryption_Decryption
{
    static byte ar[];
    public static void encrpyt(String file,char ch)throws IOException
    {
        File f1=new File(file);
        System.out.println(f1.length());
        FileInputStream fin = new FileInputStream(f1);

        byte ar1[]=null;
        byte ar2[]=null;
        try
        {
            ar1=new byte[(int)f1.length()];
        }
        catch(Exception e)
        {
            ar1=new byte[(int)((f1.length())/2)];
            ar2=new byte[(int)((f1.length())/2)];
        }
        if(ar2==null)
            fin.read(ar1);
        else
        {
            fin.read(ar1);
            fin.read(ar2);
        }
        fin.close();
        FileOutputStream fout = new FileOutputStream("e:\\temp");

        for(int x=0;x<ar1.length;x++)
        {
            if(ch=='+')
            {
                if(ar2==null)
                ar1[x]++;
                else
                {
                    ar1[x]++;
                    ar2[x]++;
                }
            }
            else if(ch=='-')
            {
                if(ar2==null)
                ar1[x]--;
                else
                {
                    ar1[x]--;
                    ar2[x]--;
                }
            }
        }
        if(ar2==null)
        {
            fout.write(ar1);
        }
        else
        {
            fout.write(ar1);
            fout.write(ar2);
        }
        fout.close();

        f1.delete();
        File f2 = new File("e:\\temp");
        f2.renameTo(f1);
    }
}