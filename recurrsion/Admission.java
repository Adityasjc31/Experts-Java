package recurrsion;

import java.util.*;
class Admission
{
    int Adno[];
    public Admission()
    {
        Adno = new int[100];
    }
    
    /**
       Just for checking of program
       */
    public Admission(int size)
    {
        Adno = new int[size];
    }
    
    public void fillArray()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter element in ascending order only");
        for(int x=0;x<Adno.length;x++)
        {
            System.out.println("Enter element at index "+ x + " : ");
            Adno[x] = sc.nextInt();
            if(x!=0 && Adno[x]<=Adno[x-1])
            {
                System.out.println("Incorrect value");
                x--;
            }
        }
    }

    public int binSearch(int l,int u,int v)
    {
        if(l<=u)
        {
            int mid = (u+l)/2;
            if(Adno[mid] == v)
            {
                return 1;
            }
            else if(v>Adno[mid])
            {
                return binSearch(mid+1,u,v);
            }
            else
            {
                return binSearch(l,mid-1,v);
            }
        }
        else
        {
            return -1;
        }
    }
    
    public static void main(String args[])
    {
        Admission an = new Admission();
        an.fillArray();
        System.out.println("Ente a number to be found");
        int n = new Scanner(System.in).nextInt();
        if(an.binSearch(0,an.Adno.length - 1,n) == 1)
        {
            System.out.println(n + " Is there");
        }
        else
        {
            System.out.println(n  + " Is not there");
        }
    }
}