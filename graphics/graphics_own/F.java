package graphics.graphics_own;

import java.io.*;
import java.util.*;
class F
{
    public static void main()throws Exception
    {
        Scanner sc=new Scanner(new File("C:/Users/Aditya/Desktop/Passw.txt"));
        sc.useDelimiter("\n");
        for(int x=0;sc.hasNext() == true;x++)
        {
            String name1 = sc.nextLine();
            System.out.println("\"" + name1+"/n\"+");
            sc.nextLine();
        }
    }
}
