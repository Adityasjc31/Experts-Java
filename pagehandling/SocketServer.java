package pagehandling;

import java.net.*;
import java.io.*;
import javax.swing.*;
public class SocketServer
{
    public static void main(String args[])throws Exception
    {
        ServerSocket serversocket=null;
        try
        {
            serversocket = new ServerSocket(95);

            JOptionPane.showMessageDialog(null,"Waiting for the client to get connected");
            
            JOptionPane.showMessageDialog(null,serversocket);
            Socket s = serversocket.accept();
            JOptionPane.showMessageDialog(null,"Connected");
            receiver(s);
            s = serversocket.accept();
            String Servername = JOptionPane.showInputDialog("Type Anthing");
            OutputStreamWriter out = new OutputStreamWriter(s.getOutputStream());
            out.write(Servername);
            out.flush();
            out.close();
            JOptionPane.showMessageDialog(null,"Data Sent");
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
        finally
        {
            int confirmation_close_Of_Server=JOptionPane.showConfirmDialog(null,"Confirm to close the server");
            if(confirmation_close_Of_Server==JOptionPane.OK_OPTION)
            {
                serversocket.close();
            }
        }
    }

    private static void receiver(Socket s)throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
        String str=br.readLine();
        JOptionPane.showMessageDialog(null,"Client Data : "+str);
        br.close();
    }
}