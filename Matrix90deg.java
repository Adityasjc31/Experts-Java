import java.util.*;
public class Matrix90deg
{
    private static int A[][];
    public static void rotate90()
    {
        int r9[][] = new int[A.length][A.length];
        for(int x=0;x<A.length;x++)
        {
            for(int y=0;y<A.length;y++)
            {
                r9[x][y] = A[A.length-1-y][x];
            }
        }
        display(r9);
        System.out.println("Sum of corner elements : "+(r9[0][0]+r9[0][r9.length-1]+r9[r9.length-1][0]+r9[r9.length-1][r9.length-1]));
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
                display(A);
                A[x][y] = sc.nextInt();
            }
        }
        System.out.println("\fORIGINAL MATRIX");
        display(A);
        System.out.println("MATRIX AFTER ROTATION");
        rotate90();
    }

    public static void display(int ar[][])
    {
        for(int x=0;x<ar.length;x++)
        {
            for(int y=0;y<ar.length;y++)
            {
                System.out.print(ar[x][y]+"\t");
            }
            System.out.println();
        }
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("M=");
        int M  = sc.nextInt();
        if(M<2 || M>10)
        {
            System.out.println("THE MATRIX SIZE IS OUT OF RANGE");
            return ;
        }
        input(M);
    }
}