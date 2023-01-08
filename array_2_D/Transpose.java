package array_2_D;

import java.util.*;
class Transpose
{
    public static int[][] transpose(int ar[][])
    {
        int na[][]=new int[ar[0].length][ar.length];
        for(int x=0;x<na.length;x++)
        {
            for(int y=0;y<na.length;y++)
            {
                na[x][y]=ar[y][x];
            }
        }
        return na;
    }

    public static void main(String args[])
    {
        int m=Value_Integer.take("m");
        int n=Value_Integer.take("n");
        int ar[][]=new int[m][n];
        Inplay.input(ar);
        System.out.println("Orginal Matrix");
        Inplay.display(ar,0);
        
        System.out.println("Transposed Matrix");
        ar=transpose(ar);
        Inplay.display(ar,0);
    }
}