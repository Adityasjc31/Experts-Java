import java.util.*;
import java.io.*;
class Caller
{
    public static void main(String args [])throws IOException
    {
        Scanner sc=new Scanner(new File("C:/Users/X170/Documents/Aditya Srivastava calling file.txt"));
        while(sc.hasNextLine())
        {
            System.out.println(sc.nextLine());
        }
    }
}