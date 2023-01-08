package Gui.trying;

import java.io.*;
import java.awt.*;
import javax.swing.*;
class Verification
{
    String username,password;
    private JLabel userL,passL;
    public Verification(String[] cred,JLabel[] arg)
    {
        username=cred[0];
        password=cred[1];
        userL=arg[0];
        passL=arg[1];
        searchResponse();
    }

    private void searchResponse()
    {
        FileInputStream fin=null;
        DataInputStream din=null;

        
        try
        {
            HideUnhide.unhide("C:\\Aditya Srivastava");
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
                    if(un.equalsIgnoreCase(this.username))
                    {
                        boolean b=pass.equals(this.password);
                        if(pass.equals(this.password))
                        {
                            userL.setText("Username : ");
                            userL.setForeground(Color.BLACK);

                            passL.setText("Password : ");
                            passL.setForeground(Color.BLACK);
                            break;
                        }
                        else
                        {

                            userL.setText("!Username :");
                            userL.setForeground(Color.RED);

                            passL.setText("!Password :");
                            passL.setForeground(Color.RED);
                        }
                    }
                    else
                    {
                        userL.setText("!Username : ");
                        userL.setForeground(Color.RED);
                    }
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

    private String decoder(String var)
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