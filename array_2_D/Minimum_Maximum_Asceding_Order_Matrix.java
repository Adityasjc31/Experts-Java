package array_2_D;

import java.util.*;
import javax.swing.*;
class Minimum_Maximum_Asceding_Order_Matrix
{
    public static int[][] Sort(int ar[][])
    {
        int s[]=new int[ar.length*ar[0].length];
        int i=0;
        for(int x=0;x<ar.length;x++)
        {
            for(int y=0;y<ar[x].length;y++)
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
        for(int x=0;x<ar.length;x++)
        {
            for(int y=0;y<ar[x].length;y++)
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
        for(int x=0;x<M;x++)
        {
            for(int y=0;y<M;y++)
            {
                ar[x][y]=Integer.parseInt(JOptionPane.showInputDialog("Enter number at index "+x+","+y));
            }
        }
        int s1=0,b1=0,s2=0,b2=0;
        for(int x=0;x<ar.length;x++)
        {
            for(int y=0;y<ar[x].length;y++)
            {
                if(ar[s1][b1]<ar[x][y])
                {
                    s1=x;
                    b1=y;
                }
                
                if(ar[s2][b2]>ar[x][y])
                {
                    s2=x;
                    b2=y;
                }
                
            }
        }
        JOptionPane.showMessageDialog(null,"Maximum value is "+ar[s1][b1]+" at "+s1+","+b1+"\nMinimum Value is "+ar[s2][b2]+" at "+s2+","+b2,"",JOptionPane.PLAIN_MESSAGE);
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