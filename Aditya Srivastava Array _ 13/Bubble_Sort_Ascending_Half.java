import java.util.*;
class Bubble_Sort_Ascending_Half
{
    public static void main(String args [])
    {
        Scanner sc=new Scanner(System.in);
        int ar[]=new int[10];
        for(int x=0;x<ar.length;x++)
        {
            System.out.println("Enter number "+(x+1));ar[x]=sc.nextInt();
        }
        
        
        for(int x=0;x<=ar.length-2;x++)
        {
            for(int y=0;y<=ar.length-6;y++)
            {
                if(ar[y]>ar[y+1])
                {
                    int t=ar[y];
                    ar[y]=ar[y+1];
                    ar[y+1]=t;
                }
            }
            
            for(int y=ar.length/2;y<=ar.length-2;y++)
            {
                if(ar[y]<ar[y+1])
                {
                    int t=ar[y];
                    ar[y]=ar[y+1];
                    ar[y+1]=t;
                }
            }
        }
        System.out.println("Rearranged Array : ");
        for(int x=0;x<ar.length;x++)
        {
            System.out.print(ar[x]+"\t");
        }
    }
}