import java.util.*;
public class SortNonBoundaryElements
{
    private static int A[][];
    public static void sort()
    {
        int extract[] = new int[(A.length-2)*2];
        for(int x=1,i=0;x<A.length-1;x++)
        {
            for(int y=1;y<A.length-1;y++)
            {
                extract[i++] = A[x][y];
            }
        }

        for(int x=0;x<extract.length-1;x++)
        {
            int i=x;
            for(int y=x+1;y<extract.length;y++)
            {
                if(extract[i] > extract[y])
                {
                    i=y;
                }
            }
            int t=extract[x];
            extract[x] = extract[i];
            extract[i] = t;
        }

        int sumD=0;
        for(int x=1,i=0;x<A.length-1;x++)
        {
            for(int y=1;y<A.length-1;y++)
            {
                A[x][y] = extract[i++];
            }
        }
        display(A.length);
        System.out.println("DIAGONAL ELEMENTS");
        for(int x=0;x<=A.length-1;x++)
        {
            for(int y=0;y<=A.length-1;y++)
            {
                if(x==y || (x+y)==A.length-1)
                {
                    sumD += A[x][y];
                    System.out.print(A[x][y]+"\t");
                }
                else
                {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
        System.out.println("SUM OF THE DIAGONAL ELEMENTS = "+sumD);
    }

    public static void input(int M)
    {
        Scanner sc = new Scanner(System.in);
        A = new int[M][M];
        for(int x=0;x<M;x++)
        {
            for(int y=0;y<M;y++)
            {
                System.out.println("\fEnter element at index "+x+","+y+" : ");
                display(M);
                A[x][y] = sc.nextInt();
            }
        }
        System.out.println("\fORIGINAL MATRIX");
        display(M);
        System.out.println("REARRANGED MATRIX");
        sort();
    }

    public static void display(int M)
    {
        for(int x=0;x<M;x++)
        {
            for(int y=0;y<M;y++)
            {
                System.out.print(A[x][y]+"\t");
            }
            System.out.println();
        }
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("M=");
        int M  = sc.nextInt();
        if(M<3 || M>10)
        {
            System.out.println("THE MATRIX SIZE IS OUT OF RANGE");
            return ;
        }
        input(M);
    }
}