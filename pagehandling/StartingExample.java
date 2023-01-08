package pagehandling;

import java.net.*;
import java.io.*;
import javax.swing.*;
public class StartingExample
{
    public static void main(String args[])throws Exception
    {
        System.out.println(JOptionPane.OK_OPTION);
        //port=9999 localport=60900
        // URL url= new URL("http://abc.com/a1.txt");
        // URLConnection urlc = url.openConnection();
        // InputStream is = urlc.getInputStream();
        // int i;
        // while((i=is.read())!=-1)
        // {
            // //System.out.print((char)i);
        // }
        
        // InetAddress ip = InetAddress.getByName("www.abc.com");
        // //System.out.println(ip.getHostName());
        //System.out.println(ip.getHostAddress());
    }
    
    public static void server()throws Exception
    {
        //URL url= new URL("http://192.168.1.1");
        ServerSocket ss  = new ServerSocket(57915);
        Socket s=ss.accept();
        DataInputStream din=new DataInputStream(s.getInputStream());
        String str=(String)din.readUTF();
        System.out.println(str);
        ss.close();
    }
    
    public static void client()throws Exception
    {
        Socket s = new Socket("localhost",57915);
        DataOutputStream dout = new DataOutputStream(s.getOutputStream());
        dout.writeUTF("Hi");
        dout.flush();
        dout.close();
        s.close();
    }
}