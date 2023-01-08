package pagehandling;

import java.net.*;
import java.io.*;
import javax.swing.*;
public class SocketClient
{
    public static void main(String args[])
    {
        try
        {
            String ip = JOptionPane.showInputDialog("IP ADDRESS");
            if(ip.length()==0)
                ip=" 122.163.214.178";

            int port=Integer.parseInt(JOptionPane.showInputDialog("PORT"));
            Socket s = new Socket(ip,port);
            String str = JOptionPane.showInputDialog("Type Anthing");
            sender(s,str);
            s = new Socket(ip,port);
            InputStream is = s.getInputStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            String servrname=br.readLine();
            JOptionPane.showMessageDialog(null,"Data Recevied : "+servrname);
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
    }

    private static void sender(Socket s,String str)throws Exception
    {
        OutputStreamWriter out = new OutputStreamWriter(s.getOutputStream());
        out.write(str);
        out.flush();
        out.close();
    }
}