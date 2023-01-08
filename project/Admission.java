package project;

/**ISC - 2015 Q8*/
import java.util.*;
class Admission
{
    int Adno[];
    public Admission()
    {
        Adno = new int[100];
    }
    
    public void fillArray()
    {
        //Inputing admission number from user
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
        //Searching a value using binary search and recursive technique
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
            //Returning -1 when not found
            return -1;
        }
    }
    
    public static void main(String args[])
    {
        Admission an = new Admission();
        an.fillArray();
        System.out.println("Ente admission number to be found");
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