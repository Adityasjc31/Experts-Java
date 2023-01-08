import java.util.*;
class MatBound
{
    int mat[][],size;
    public MatBound(int n)
    {
        size=n;
        mat=new int[size][size];
    }

    public void accept()
    {
        for(int x=0;x<size;x++)
        {
            for(int y=0;y<size;y++)
            {
                System.out.println("Enter a number at index "+x+","+y+":");
                mat[x][y]=new Scanner(System.in).nextInt();
            }
        }
    }

    public void findSum()
    {
        for(int x=0;x<size;x++)
        {
            int s=0;String t="";
            for(int y=0;y<size;y++)
            {
                if(x==0)
                {
                    s+=mat[x][y];
                    t="upper";
                }
                else if(y==size-1)
                {
                    s+=mat[x][y];
                    t="right";
                }
                else if(y==0)
                {
                    s+=mat[x][y];
                    t="below";
                }
                else if(x==size-1)
                {
                    s+=mat[x][y];
                    t="left";
                }
            }
            System.out.println("Sum of "+t+" diagonal : "+s);
        }
    }

    public void display()
    {
        for(int x=0;x<size;x++)
        {
            for(int y=0;y<size;y++)
            {
                System.out.print(mat[x][y]+"\t");
            }
            System.out.println();
        }
    }

    public static void main(String args[])
    {
        System.out.println("Enter dimension of square matrix");
        int n=new Scanner(System.in).nextInt();
        MatBound m = new MatBound(n);
        m.accept();
        System.out.print("\f");
        m.display();
        m.findSum();
    }
}