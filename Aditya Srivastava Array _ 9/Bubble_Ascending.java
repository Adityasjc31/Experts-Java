import java.util.*;
class Bubble_Ascending
{
    public static void main(String args [])
    {
        Scanner sc=new Scanner(System.in);
        int ar[]={5,3,8,4,9,2,1,12,98,16};
        for(int x=0;x<ar.length-1;x++)
        {
            for(int y=0;y<ar.length-1-x;y++)
            {
                if(ar[y]>ar[y+1])
                {
                    int t=ar[y];
                    ar[y]=ar[y+1];
                    ar[y+1]=t;
                }
            }
        }
        System.out.println("Ascending Order : ");
        for(int x=0;x<ar.length;x++)
        {
            System.out.println(ar[x]);
        }
    }
}