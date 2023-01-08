package function;
import java.util.Scanner;
import java.io.*;
class Volume_Terminal
{
    public static void display()throws IOException
    {
        File f=new File("C:/Users/X170.SERVER/Documents/Aditya Input Source Code on Terminal Window.txt");
        Scanner sc=new Scanner(f);
        while(sc.hasNextLine())
        {
            System.out.println(sc.nextLine());
        }
    }
}