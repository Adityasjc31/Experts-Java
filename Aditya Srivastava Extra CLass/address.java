import java.util.Scanner;
import java.io.*;
class address
{
    public static void readfile()throws IOException
    {
        File f=new File("C:/Users/X170/Documents/Aditya Input Source Code on Terminal Window Try_Catch.txt");
        Scanner scanner=new Scanner(f);
        while(scanner.hasNextLine())
        {
            System.out.println(scanner.nextLine());
        }

    }
}