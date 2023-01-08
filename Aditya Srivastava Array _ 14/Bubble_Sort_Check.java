import java.util.*;
class Bubble_Sort_Check
{
    public static void main(String args [])
    {
        Scanner sc=new Scanner(System.in);
        int ar[]=new int[10];
        for(int x=0;x<ar.length;System.out.println("Enter number "+(x+1)),ar[x]=sc.nextInt(),sc.nextLine(),x++);

        boolean i=true,d=true;

        for(int y=0;y<ar.length-1;y++)
        {
            if(ar[y]>ar[y+1])
            {
                i=false; 
            }
            if(ar[y]<ar[y+1])
            {
                d=false;System.out.println("\t\t\t\td=="+d);
            }
        }

        
        if(d==true && i==true)
        {
            System.out.println("Array is Sorted");
        }
        else if(i==true)
        {
            System.out.println("Array is arranged in Increasing order");
        }
        else if(d==true)
        {
            System.out.println("Array is arranged in Decreasing order");
        }
        else 
        {
            System.out.println("Unsorted Array");
        }
    }
}