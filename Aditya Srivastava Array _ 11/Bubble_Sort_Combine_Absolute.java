import java.util.*;
class Bubble_Sort_Combine_Absolute
{
    public static void main(String args [])
    {
        Scanner sc=new Scanner(System.in);
        int ar[]=new int[10];
        for(int x=0;x<ar.length;x++)
        {
            System.out.println("Enter number "+(x+1));ar[x]=sc.nextInt();
        }
        
        for(int x=0;x<ar.length-1;x++)
        {
            for(int y=0;y<ar.length-1-x;y++)
            {
                if(Math.abs(ar[y])>Math.abs(ar[y+1]))
                {
                    int t=ar[y];
                    ar[y]=ar[y+1];
                    ar[y+1]=t;
                }
            }
        }
        
        System.out.println("Array");
        for(int x=0;x<ar.length;x++)
        {
            System.out.print(ar[x]+"\t");
        }
    }
}