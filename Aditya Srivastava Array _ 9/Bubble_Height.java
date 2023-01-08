import java.util.*;
class Bubble_Height
{
    public static void main(String args [])
    {
        Scanner sc=new Scanner(System.in);
        int ar[]=new int[10];
        String arr[]=new String[10];
        for(int x=0;x<ar.length;x++)
        {
            System.out.println("Enter name of player "+(x+1));
            System.out.println("Enter his height "+arr[x]);ar[x]=sc.nextInt();
        }
        
        for(int x=0;x<ar.length-1;x++)
        {
            for(int y=0;y<ar.length-1-x;y++)
            {
                if(ar[y]>ar[y+1])
                {
                    int t=ar[y];String t1=arr[y];
                    ar[y]=ar[y+1];arr[y]=arr[y+1];
                    ar[y+1]=t;arr[y+1]=t1;
                }
            }
        }
        System.out.println("Height\tPlayer");
        for(int x=0;x<ar.length;System.out.println(ar[x]+"\t"+arr[x]),x++);
    }
}