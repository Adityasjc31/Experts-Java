package array_2_D;
import java.util.*;
class Change
{
    public static int[][] Spiral_entry(int ar[][])
    {
        int t=1,i=0,r=0,c=-1;
        for(double x=ar.length;x>=1;x-=0.5)
        {
            for(int y=1;y<=x;y++)
            {
                System.out.print("\f");
                Inplay.display(ar,true);
                System.out.println("Enter number at index "+(int)x+","+y+" : ");
                if(t==1)c++;
                else if(t==2)r++;
                else if(t==3)c--;
                else 
                {
                    r--;
                    t=0;
                }
                ar[r][c]=new Scanner(System.in).nextInt();
            }
            t++;
        }
        System.out.print("\f");
        Inplay.display(ar,true);
        return ar;
    }
    
    public static int[][] Spiral_right(int ar[][],int s[])throws Exception
    {
        int t=1,i=s.length-1,r=0,c=ar.length;
        for(double x=ar.length;x>=1;x-=0.5)
        {
            for(int y=1;y<=x;y++)
            {
                System.out.print("\fSpirally Arranging(Right)...\n");
                Inplay.display(ar,0);
                Thread.sleep(500);
                if(t==1)c--;
                else if(t==2)r++;
                else if(t==3)c++;
                else 
                {
                    r--;
                    t=0;
                }
                ar[r][c]=s[i--];;
            }
            t++;
        }
        return ar;
    }
    
    public static int[][] Spiral_left(int ar[][],int s[])throws Exception
    {
        int t=1,i=0,r=0,c=-1;
        for(double x=ar.length;x>=1;x-=0.5)
        {
            for(int y=1;y<=x;y++)
            {
                System.out.print("\fSpirally Arranging(Left)...\n");
                Inplay.display(ar,0);
                Thread.sleep(500);
                if(t==1)c++;
                else if(t==2)r++;
                else if(t==3)c--;
                else 
                {
                    r--;
                    t=0;
                }
                ar[r][c]=s[i++];
            }
            t++;
        }
        return ar;
    }

    public static int[] BoundaryDimensionchangefromdoubletosingle(int ar[][],int change)
    {
        int i=0;
        int s[]=new int[change];
        for(int x=0;x<ar.length;x++)
        {
            for(int y=0;y<ar[x].length;y++)
            {
                if(y==0 || y==ar[x].length-1 || x==0 || x==ar.length-1)
                {
                    s[i++]=ar[x][y];
                }
            }
        }
        return s;
    }

    public static int[] Doubletosingle(int ar[][])
    {
        int i=0;
        int s[]=new int[ar.length*ar[0].length];
        for(int x=0;x<ar.length;x++)
        {
            for(int y=0;y<ar[x].length;y++)
            {
                s[i++]=ar[x][y];
            }
        }

        return s;
    }
}