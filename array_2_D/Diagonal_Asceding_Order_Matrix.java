package array_2_D;

import java.util.*;
import javax.swing.*;
class Diagonal_Asceding_Order_Matrix
{
    public static int[][] Sort(int ar[][])
    {
        int s[]=new int[(ar.length-2)*(ar.length-2)];
        int i=0;
        for(int x=1;x<ar.length-1;x++)
        {
            for(int y=1;y<ar[x].length-1;y++)
            {
                s[i++]=ar[x][y];
            }
        }

        for(int x=0;x<s.length-1;x++)
        {
            int in=x;

            for(int y=x+1;y<s.length;y++)
            {
                if(s[y]<s[in])
                {
                    in=y;
                }
            }

            int t=s[x];
            s[x]=s[in];
            s[in]=t;

        }
        i=0;
        for(int x=1;x<ar.length-1;x++)
        {
            for(int y=1;y<ar[x].length-1;y++)
            {
                ar[x][y]=s[i++];
            }
        }
        return ar;
    }

    public static void main(String args[])
    {
        int M=Integer.parseInt(JOptionPane.showInputDialog("Enter size of matrix"));
                          
        int ar[][]=new int[M][M];
        Inplay.Input(ar);
        System.out.println("\nDiagonal");
        for(int x=0;x<ar.length;x++)
        {
            for(int y=0;y<ar[x].length;y++)
            {
                if(x==y || x+y==M-1)
                {
                    System.out.print(ar[x][y]+"\t");
                }
                else
                {
                    System.out.print("\t");
                }
            }
            System.out.println("\t");
        }
        System.out.println("Rearranged");
        ar=Sort(ar);
        for(int x=0;x<M;x++)
        {
            for(int y=0;y<M;y++)
            {
                System.out.print(ar[x][y]+"\t");
            }
            System.out.println();
        }
    }
}