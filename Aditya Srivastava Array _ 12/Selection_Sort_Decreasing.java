import java.util.*;
class Selection_Sort_Decreasing
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
            int in=x;
            
            for(int y=x+1;y<ar.length;y++)
            {
                if(ar[y]>ar[in])
                {
                    in=y;
                }
            }
            
            int t=ar[x];
            ar[x]=ar[in];
            ar[in]=t;

        }
        System.out.println("Ascending Order : ");
        for(int x=0;x<ar.length;x++)
        {
            System.out.println(ar[x]);
        }
    }
}