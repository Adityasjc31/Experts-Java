 

import java.util.*;
import java.io.*;
class Reading_Changing
{
    public int develop()throws Exception
    {
        int c=0;
        Scanner sc = new Scanner(new File("C:/Users/X170/Documents/file.txt"));
        int n=1;c=0;
        sc.useDelimiter("\n");
        while(sc.hasNextLine() == true)
        {
            String s=sc.nextLine();
            n++;            
            c++;
        }
        return c;
    }

    public static void main(String args [])throws Exception
    {
        Scanner sc = new Scanner(new File("C:/Users/X170/Documents/file.txt"));
        Reading_Changing ob = new Reading_Changing();
        int u=ob.develop();
        int n=1;int a[]= new int[u+1];
        sc.useDelimiter("\n");
        while(sc.hasNextLine() == true)
        {
            String s=sc.nextLine();
            System.out.println(n+") "+s);
            a[n]=ob.disp();
            n++;
        }
    }

    public int disp()throws Exception
    {
        Scanner sc = new Scanner(System.in);
        Reading_Changing ob = new Reading_Changing();
        int u;
        u=ob.develop();
        int a;
        System.out.println("Enter total marks ");
        a=sc.nextInt();
        return a;
    }
}