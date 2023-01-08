package project;

/**ISC 2016 Q8*/
import java.util.*;
class Shift
{
    int mat[][],m,n;
    Shift(int mm,int nn)
    {
        m=mm;
        n=nn;
        mat = new int[m][n];
    }
    
    void input()
    {
        //Taking input from user
        for(int x=0;x<m;x++)
        {
            for(int y=0;y<n;y++)
            {
                System.out.print("Enter number at index "+x+","+y+" : ");
                mat[x][y] = new Scanner(System.in).nextInt();
            }
        }
    }
    
    void cyclic(Shift P)
    {
        //Making a cyclic shift
        for(int x=1;x<P.m;x++)
        {
            mat[x-1] = P.mat[x];
        }
        mat[m-1] = P.mat[0];
    }
    
    void display()
    {
        //Displaying the array
        for(int x=0;x<m;x++)
        {
            for(int y=0;y<n;y++)
            {
                System.out.print(mat[x][y]+"\t");
            }
            System.out.println();
        }
    }
    
    public static void main(String args[])
    {
        Shift s1 = new Shift(3,4);
        Shift s2 = new Shift(3,4);
        s1.input();
        s2.cyclic(s1);
        
        s1.display();
        System.out.println();
        s2.display();
    }
}