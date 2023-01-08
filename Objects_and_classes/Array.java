package Objects_and_classes;

import java.util.*;
class Array
{
    static int c[];
    public static int[] Join(int a[],int b[])
    {
        int ar[] = new int[a.length+b.length];
        System.arraycopy(a,0,ar,0,a.length);
        System.arraycopy(b,0,ar,a.length,b.length);
        return ar;
    }

    public static void input()
    {
        int a[]=new int[5];
        int b[]=new int[5];
        for(int x=0;x<a.length;x++)
        {
            System.out.println("Enter number "+(x+1));
            a[x]=new Scanner(System.in).nextInt();
        }

        for(int x=0;x<b.length;x++)
        {
            System.out.println("Enter number "+(x+1));
            b[x]=new Scanner(System.in).nextInt();
        }
        c=Join(a,b);
        System.out.println("Joined Array");
        for(int x=0;x<c.length;x++)
        {
            System.out.println(c[x]);
        }
    }
}