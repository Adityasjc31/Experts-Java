package Objects_and_classes;

import java.util.*;
class Matrix
{
    int arr[][],m,n;
    public Matrix(int mm,int nn)
    {
        n=nn;
        m=mm;
        arr=new int[m][n];
    }
    
    public void fillarray()
    {
        for(int x=0;x<m;x++)
        {
            for(int y=0;y<n;y++)
            {
                System.out.println("Enter number at array at index "+x+","+y);
                arr[x][y]=new Scanner(System.in).nextInt();
            }
        }
    }
    
    public void display()
    {
        for(int x=0;x<m;x++)
        {
            for(int y=0;y<n;y++)
            {
                System.out.print(arr[x][y]+" ");
            }
            System.out.println();
        }
    }
    
    public Matrix subMat(Matrix a)
    {
        Matrix ob = new Matrix(m,n);
        for(int x=0;x<m;x++)
        {
            for(int y=0;y<n;y++)
            {
                ob.arr[x][y] = a.arr[x][y]-arr[x][y];
            }
        }
        return ob;
    }
    
    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows");
        int r=sc.nextInt();
        System.out.println("Enter number of columns");
        int c=sc.nextInt();
        Matrix a = new Matrix(r,c);
        Matrix b = new Matrix(r,c);
        a.fillarray();
        b.fillarray();
        Matrix c1 = a.subMat(b);
        System.out.println("Matrix 1");
        a.display();
        System.out.println("Matrix 2");
        b.display();
        System.out.println("Matrix 2 - Matrix 1");
        c1.display();
    }
}