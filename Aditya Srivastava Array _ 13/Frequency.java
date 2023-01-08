import java.util.*;
class Frequency
{
    public static void main(String args [])
    {
        Scanner sc=new Scanner(System.in);
        int ar[]=new int[10];
        for(int x=0;x<ar.length;x++)
        {
            System.out.println("Enter number "+(x+1));ar[x]=sc.nextInt();
        }
        
        System.out.println("Name\tFrequency");
        outer :
        for(int x=0;x<ar.length-1;x++)
        {
            int in=x;
            for(int y=0;y<x;y++)
            {
                if(ar[x]==ar[y])
                {
                    continue outer;
                }
            }
            int c=0;
            for(int y=x;y<ar.length;y++)
            {
                if(ar[y]==ar[x])
                {
                    c++;
                }
            }
            System.out.println(ar[x]+"\t"+c);
        }
    }
}