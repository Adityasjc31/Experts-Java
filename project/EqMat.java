package project;

/**ISC 2018 Q8*/
import java.util.*;
class EqMat
{
    int a[][],m,n;
    EqMat(int mm,int nn)
    {
        m=mm;
        n=nn;
        //Creating array of mxn size
        a = new int[m][n];
    }

    public void readarray()
    {
        for(int x=0;x<m;x++)
        {
            for(int y=0;y<n;y++)
            {
                System.out.print("Enter a number at index "+x+","+y+" : ");
                a[x][y] = new Scanner(System.in).nextInt();
            }
        }
    }
    
    int check(EqMat P,EqMat Q)
    {
        //checking whether the given two matrix are equal or not
        if(P.m*P.n != Q.m*Q.n)
        {
            return 0;
        }
        
        for(int x=0;x<P.m;x++)
        {
            for(int y=0;y<Q.n;y++)
            {
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
        //displaying the array
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
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows for 1st matrix");
        int r=sc.nextInt();
        System.out.println("Enter columns for 1st matrix");
        int c=sc.nextInt();
        
        EqMat em1 = new EqMat(r,c);
        
        em1.readarray();
        
        System.out.println("Enter rows for 2nd matrix");
        r=sc.nextInt();
        System.out.println("Enter columns for 2nd matrix");
        c=sc.nextInt();
        
        EqMat em2 = new EqMat(r,c);
        
        em2.readarray();
        
        em1.print();
        System.out.println();
        em2.print();
        
        if(em1.check(em1,em2) == 1)
        {
            System.out.println("Equal");
        }
        else
        {
            System.out.println("Not Equal");
        }
    }
}