import java.util.*;
class Moving_Average
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int ar[]=new int[10];
        for(int x=0;x<ar.length;System.out.println("Enter sale of "+(x+2005)),ar[x]=sc.nextInt(),x++);
        for(int x=0;x<(ar.length-3);System.out.println("Average of "+(x+2005)+", "+(x+2006)+" and "+(x+2007)+" = "+((ar[x]+ar[x+1]+ar[x+2])/3.0)),x++);
    }
}