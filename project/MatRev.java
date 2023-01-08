package project;

/**ISC 2019 Q8*/
import java.util.*;
class MatRev
{
    int arr[][];
    int m,n;
    MatRev(int mm,int nn)
    {
        m = mm;
        n = nn;
        //initializing array
        arr = new int[m][n];
    }
    
    void fillarray()
    {
        for(int x=0;x<m;x++)
        {
            for(int y=0;y<n;y++)
            {
                System.out.print("Enter element at index "+x+","+y+" : ");
                arr[x][y] = new Scanner(System.in).nextInt();
            }
        }
    }
    
    int reverse(int x)
    {
        //reversing the number
        int n=0;
        for(int i=x;i!=0;i=i/10)
        {
            int d=i%10;
            n = d + n*10;
        }
        return n;
    }
    
    void revMat(MatRev P)
    {
        for(int x=0;x<P.arr.length;x++)
        {
            for(int y=0;y<P.arr[x].length;y++)
            {
                arr[x][y] = reverse(P.arr[x][y]);
            }
        }
    }
    
    void show()
    {
        //displaying the array
        for(int x=0;x<m;x++)
        {
            for(int y=0;y<n;y++)
            {
                System.out.print(arr[x][y] + "\t");
            }
            System.out.println();
        }
    }
    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows");
        int m = sc.nextInt();
        System.out.println("Enter columns");
        int n = sc.nextInt();
        
        MatRev mr1 = new MatRev(m,n);
        MatRev mr2 = new MatRev(m,n);
        
        mr1.fillarray();
        
        mr2.revMat(mr1);
        
        mr1.show();
        System.out.println();
        mr2.show();
    }
}