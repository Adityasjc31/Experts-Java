import java.util.*;
class Q7
{
    public static void main(String args [])
    {
        Scanner sc = new Scanner(System.in);
        int n[]=new int [10];
        for(int x=0;x<n.length;
        System.out.println("Enter any number"),n[x]=sc.nextInt(),x++);
        for(int x=0;x<n.length-1;x++)
        {
            for(int y=0;y<n.length-1-x;y++)
            {
                if(n[y]>n[y+1])
                {
                    int t=n[y];
                    n[y]=n[y+1];
                    n[y]=t;
                }
            }
        }
        for(int x=0;x<n.length;
        System.out.print(n[x]+" "),x++);
    }
}