package array_2_D;

import java.util.*;
class Generation_of_Wondrous_Square
{
    public static void main(String args [])throws Exception
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of square");
        int n=sc.nextInt();
        int ar[][]=new int[n][n];
        int r=0,c=n/2;
        for(int x=1;x<=n*n;x++)
        {
            ar[r][c]=x;
            System.out.print("\f");
            Inplay.display(ar,0);
            Thread.sleep(250);
            int r1=r-1,c1=c+1;
            if(r1==-1)
            {
                r1=n-1;
            }

            if(c1==n)
            {
                c1=0;
            }

            if(ar[r1][c1]!=0)
            {
                r1=r+1;
                c1=c;
            }
            r=r1;
            c=c1;
        }
        System.out.println("You want to see any number");
        int m=sc.nextInt();
        System.out.print("\f");
        Inplay.display(ar,m);
    }
}