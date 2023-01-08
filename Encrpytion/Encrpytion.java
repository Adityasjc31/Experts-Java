package Encrpytion;

import java.io.*;
class Encrpytion
{
    public static byte[] Image_File()throws IOException
    {
        File f=new File("e:\\expPic.jpg");
        FileInputStream fin=new FileInputStream(f);
        byte b[]=new byte[(int)f.length()];
        fin.read(b);
        /*for(int x=0;x<b.length;x++)
        {
            System.out.print(b[x]+"  ");
            if(x!=0 && x%10000==0)
            {
                System.out.println();
            }
        }*/
        return b;
    }
    
    public static void New_Image_File()throws IOException
    {
        File f=new File("expPic1.jpg");
        FileOutputStream fout=new FileOutputStream(f);
        DataOutputStream dout=new DataOutputStream(fout);
        byte b[]=Image_File();
        for(int x=0;x<b.length;x++)
        {
            //b[x]=(byte)(b[x]+2);
            dout.writeByte(b[x]);
        }
        dout.close();
        fout.close();
    }
}