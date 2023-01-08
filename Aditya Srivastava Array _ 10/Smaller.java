import java.util.*;
class Smaller
{
    public static void main(String args [])
    {
        Scanner sc=new Scanner(System.in);
        int ar[]=new int[5];
        for(int x=0;x<ar.length;System.out.println("Enter any number"),ar[x]=sc.nextInt(),x++);
        int s=0,sm=ar[0];
        for(int x=0;x<ar.length;x++)
        {
            if(ar[x]<sm)
            {
                sm=ar[x];
                s=x;
            }
        }
        System.out.println("Smaller number at index : "+s);
    }
}