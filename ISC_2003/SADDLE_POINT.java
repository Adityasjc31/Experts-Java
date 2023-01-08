package ISC_2003;

import java.util.*;
class SADDLE_POINT
{
    static int A[][];
    private static void input()
    {
        System.out.println("Enter dimensions of the matrix");
        int N=new Scanner(System.in).nextInt();
        A=new int[N][N];

        for(int x=0;x<N;x++)
        {
            for(int y=0;y<N;y++)
            {
                System.out.println("Enter value at index "+x+","+y);
                A[x][y]=new Scanner(System.in).nextInt();
            }
        }
    }

    public static void sort(int ar[][])
    {
        for(int x=1;x<ar.length;x++)
        {
            int i=x;
            int t=ar[x][x];
            while(ar[i-1][i-1]>t)
            {
                ar[i][i]=ar[i-1][i-1];
                i--;
                if(i==0)
                {
                    break;
                }
            }
            ar[i][i]=t;
        }
    }

    private static void display()
    {
        for(int x=0;x<A.length;x++)
        {
            for(int y=0;y<A.length;y++)
            {
                System.out.print(A[x][y]+"\t");
            }
            System.out.println();
        }
    }
    static int ROW=-1,COLUMN=-1;
    private static void findSaddlePoint(int ar[][])
    {
        for(int x=0;x<ar.length;x++)
        {
            int i=x;
            for(int y=0;y<ar.length;y++)
            {
                if(ar[i][i]>ar[x][y])
                {
                    i=y;
                }
            }
            if(x==i)
            {
                ROW=i;
                for(int c=0;c<ar.length;c++)
                {
                    if(ar[c][x]>ar[i][i])
                    {
                        i=c;
                    }
                }
                if(x==i)
                {
                    COLUMN=i;
                    break;
                }
            }
        }
    }

    public static void main(String args[])
    {
        input();
        System.out.println("\fMatrix is : ");
        display();
        findSaddlePoint(A);
        if(ROW>-1 && COLUMN>-1)
        {
            System.out.println("SADDLE POINT : "+A[ROW][COLUMN]);
        }
        else
        {
            System.out.println("NO SADDLE POINT");
        }
        System.out.println("MATRIX AFTER SORTING THE PRINCIPAL DIAGONAL : ");
        sort(A);
        display();
    }
}