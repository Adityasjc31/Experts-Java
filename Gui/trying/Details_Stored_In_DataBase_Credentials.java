package Gui.trying;

import java.io.*;
import javax.swing.*;
class Details_Stored_In_DataBase_Credentials
{
    public static void main(String args[])
    {
        FileInputStream fin=null;
        DataInputStream din=null;
        try
        {
            HideUnhide.unhide("C:\\Aditya Srivastava\\Credentials.adi");
            fin = new FileInputStream("C:\\Aditya Srivastava\\Credentials.adi");
            din = new DataInputStream(fin);
            boolean eof=false;
            while(!eof)
            {
                try
                {
                    String username=din.readUTF();
                    String un=decoder("##"+username+"##");
                    String password=din.readUTF();
                    String pass=decoder(password);
                    System.out.println(username+"->"+un+"\t"+password+"->"+pass);
                }
                catch(Exception ef)
                {
                    eof=true;
                }
            }
        }
        catch(NullPointerException e1)
        {
            JOptionPane.showMessageDialog(null,"Something went wrong","Error",JOptionPane.ERROR_MESSAGE);
        }
        catch(FileNotFoundException e2)
        {
            JOptionPane.showMessageDialog(null,"Unable to verify Credentials\nUnable to find File","Error",JOptionPane.ERROR_MESSAGE);
        }
        catch(IOException e3)
        {
            JOptionPane.showMessageDialog(null,"Something went wrong","Error",JOptionPane.ERROR_MESSAGE);
        }
        catch(Exception ef)
        {
        }
        finally
        {
            try
            {
                din.close();
                fin.close();
                
                HideUnhide.hide("C:\\Aditya Srivastava");
                HideUnhide.hide("C:\\Aditya Srivastava\\Credentials.adi");
            }
            catch(Exception e)
            {
            }
        }
    }

    private static String decoder(String var)
    {
        String sender="";
        for(int x=0;x<var.length();x++)
        {
            char ch=var.charAt(x);
            int decodedChar=(int)ch-5;
            sender+=(char)decodedChar;
        }
        return sender.substring(2,var.length()-2);
    }
}