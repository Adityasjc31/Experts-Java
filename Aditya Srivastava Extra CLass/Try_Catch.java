import java.util.*;
import java.io.*;
class Try_Catch
{
    public static void main(String args [])throws IOException
    {
        Scanner sc=new Scanner(System.in);
        try
        {
            System.out.println("Enter a Integer");
            int i=sc.nextInt();
        }
    
        catch(InputMismatchException e)
        {
            System.out.println("Wrong value Input");
        }
    }
}        