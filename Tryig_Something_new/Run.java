package Tryig_Something_new;

import java.io.*;
public class Run
{
    public static void main(String[] args) throws Exception 
    {
        ProcessBuilder pb = new ProcessBuilder();
        pb.command("H:","cd C drive\\documents\\class 12\\","java Tryig_Something_new.Hello");
        Process p1 = pb.start();
        
        BufferedReader br = new BufferedReader(new InputStreamReader(p1.getInputStream()));
        String line="";
        while((line = br.readLine())!=null)
        {
            System.out.println(line);
        }
    }
}