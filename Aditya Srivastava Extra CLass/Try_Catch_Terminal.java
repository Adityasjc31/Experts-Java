import java.util.Scanner;
import java.io.*;
class Try_Catch_Terminal
{
    public static void readfile()throws IOException
    {
        File f=new File("C:/Users/X170/Documents/Aditya Input Source Code on Terminal Window Try_Catch.txt");
        Scanner sc=new Scanner(f);
        while(sc.hasNextLine())
        {
            System.out.println(sc.nextLine());
        }

    }
}