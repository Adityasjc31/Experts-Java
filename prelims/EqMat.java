package prelims;

import java.util.*;
class EqMat
{
    int a[][],m,n;
    EqMat(int mm,int nn)
    {
        m=mm;
        n=nn;
        a = new int[m][n];
    }
    
    void readarray()
    {
        for(int x=0;x<m;x++)
        {
            for(int y=0;y<n;y++)
            {
                //Entering a number from keyboard
                System.out.print("Enter a number at index "+x+","+y+" : ");
                a[x][y] = new Scanner(System.in).nextInt();
            }
        }
    }
    
    int check(EqMat P,EqMat Q)
    {
        for(int x=0;x<P.m;x++)
        {
            for(int y=0;y<P.n;y++)
            {
                //checking whether the number of two matrix is equal or not
                if(P.a[x][y] != Q.a[x][y])
                {
                    return 0;
                }
            }
        }
        return 1;
    }
    
    void print()
    {
        //Displaying the array
        for(int x=0;x<m;x++)
        {
            for(int y=0;y<n;y++)
            {
                System.out.print(a[x][y] + "\t");
            }
            System.out.println();
        }
    }
    
    public static void main(String args[])
    {
        EqMat A = new EqMat(3,3);
        EqMat B = new EqMat(3,3);
        System.out.println("Enter for matrix 1 ");
        A.readarray();
        System.out.println("Enter for matrix 2");
        B.readarray();
        A.print();
        B.print();
        if(A.check(A,B)==1)
        {
            System.out.println("Both are equal matrix");
        }
        else
        {
            System.out.println("Both are unequal matrix");
        }
    }
}