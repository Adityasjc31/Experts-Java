package array_2_D;

import java.util.*;
class Arrangement_Boundary_Elements
{
    public static void main(String Aditya[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Dimesions of 2D array");
        String d2=sc.nextLine();
        StringTokenizer st=new StringTokenizer(d2,"X,x,*");
        int m=Integer.valueOf(st.nextToken());
        int n=Integer.valueOf(st.nextToken());
        
        int ar[][]=new int[m][n];
        Inplay.input(ar);
        int s[]=Change.BoundaryDimensionchangefromdoubletosingle(ar,(2*n+2*m)-4);
        s=Selection.Sort(s);
        int i=0;
        for(int y=0;y<n;y++)
        {
            ar[0][y]=s[i++];
        }
        for(int x=1;x<m;x++)
        {
            ar[x][n-1]=s[i++];
        }
        for(int y=n-2;y>=0;y--)
        {
            ar[m-1][y]=s[i++];
        }
        for(int x=m-2;x>=1;x--)
        {
            ar[x][0]=s[i++];
        }
        System.out.println("Arranged Boundary Elements");
        Inplay.display(ar,0);
    }
}