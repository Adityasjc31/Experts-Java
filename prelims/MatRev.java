package prelims;

import java.util.*;
class MatRev
{
    int arr[][],m,n;
    MatRev(int mm,int nn)
    {
        m=mm;
        n=nn;
        arr = new int[m][n];
    }

    void fillarray()
    {
        for(int x=0;x<m;x++)
        {
            for(int y=0;y<n;y++)
            {
                System.out.print("Enter number at index "+x+","+y+" : ");
                arr[x][y] = new Scanner(System.in).nextInt();
            }
        }
    }
    
    int reverse(int x)
    {
        //Reversing a number
        int r=0;
        for(int i=x;i!=0;i/=10)
        {
            int d = i%10;
            r = r*10+d;
        }
        return r;
    }
    
    void revMat(MatRev P)
    {
        for(int x=0;x<P.m;x++)
        {
            for(int y=0;y<P.n;y++)
            {
                //filling the reverse array
                arr[x][y] = reverse(P.arr[x][y]);
            }
        }
    }
    
    void show()
    {
        for(int x=0;x<m;x++)
        {
            for(int y=0;y<n;y++)
            {
                //displaying the array
                System.out.print(arr[x][y] + "\t");
            }
            System.out.println();
        }
    }
    
    public static void main(String args[])
    {
        MatRev A = new MatRev(3,3);
        MatRev B = new MatRev(3,3);
        A.fillarray();
        B.revMat(A);
        System.out.println("Matrix : ");
        A.show();
        System.out.println("Reversed Matrix : ");
        B.show();
    }
}