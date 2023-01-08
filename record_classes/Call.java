package record_classes;

import javax.swing.*;
import java.io.*;
class Call
{
    public static void main(String args[])
    {
        /*JFrame.setDefaultLookAndFeelDecorated(true);
        Notes n = new Notes();
        n.init();*/
        File f = new File("C:\\");
        String ar[] = f.list();
        System.out.print("[");
        for(int x=0;x<ar.length;x++)
        {
            System.out.print("\""+ar[x]+"\",");
        }
        System.out.println("]");
    }
}