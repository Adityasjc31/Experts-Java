package prelims;

import java.util.*;
class Record
{
    String n[];
    int m[],size;
    Record(int cap)
    {
        size=cap;
        m = new int[size];
        n = new String[size];
    }
    
    void readarray()
    {
        for(int x=0;x<size;x++)
        {
            System.out.print("Enter name of student "+(x+1)+" : ");
            n[x] = new Scanner(System.in).nextLine();
            System.out.print("Enter marks of "+n[x]+" : ");
            m[x] = new Scanner(System.in).nextInt();
        }
    }
    
    void display()
    {
        for(int x=0;x<size;x++)
        {
            System.out.println("Name of student "+(x+1)+" : "+m[x]);
            System.out.println("Marks obtained by "+m[x]+" is : ");
        }
    }
}