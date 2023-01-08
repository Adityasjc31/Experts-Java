import java.util.Scanner;
import java.io.*;
class Inputed
{
    public static void display()throws IOException
    {
        File f=new File("C:/Users/X170/Documents/Inputed.txt");
        Scanner sc=new Scanner(f);
        while(sc.hasNextLine())
        {
            System.out.println(sc.nextLine());
        }

    }
}